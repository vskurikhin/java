package su.svn.chap11;

public class Deadlock implements Runnable {
    // An example of deadlock.
    // Пример взаимной блокировки
    static class A {
        synchronized void foo(B b) {
            String name = Thread.currentThread().getName();

            System.out.println(name + "вошел в метод A.foo()");

            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println("Класс A прерван");
            }

            System.out.println(name + " пытается вызвать метод B.last()");
            b.last();
        }

        synchronized void last() {
            System.out.println("В методе A.last()");
        }
    }

    static class B {
        synchronized void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " вошел в метод B.bar()");

            try {
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println("Класс B прерван");
            }

            System.out.println(name + " пытается вызвать метод A.last()");
            a.last();
        }

        synchronized void last() {
            System.out.println("В методе A.last()");
        }
    }

    A a = new A();
    B b = new B();
    Thread t;

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        t = new Thread(this, "Соперничающий поок");
    }

    void deadlockStart() {
        t.start(); // get lock on a in this thread.
        a.foo(b);  // получить блокировку для объекта a в данном потоке исполнения
        System.out.println("Назад в главный поток");
    }

    public void run() { // get lock on b in other thread.
        b.bar(a);       // получить блокировку для объекта b в другом потоке исполнения
        System.out.println("Назад в другой поток");
    }

    public static void main(String args[]) {
        Deadlock dl = new Deadlock();

        dl.deadlockStart();
    }
}

