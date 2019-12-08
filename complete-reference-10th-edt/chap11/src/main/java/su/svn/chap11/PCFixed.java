package su.svn.chap11;

public class PCFixed {

    static class A {
        synchronized void foo(B b) {
            String name = Thread.currentThread().getName();

            System.out.println(name + " entered A.foo");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("A Interrupted");
            }

            System.out.println(name + " trying to call B.last()");
            b.last();
        }

        synchronized void last() {
            System.out.println("Inside A.last");
        }
    }

    static class B {
        synchronized void bar(A a) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " entered B.bar");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("B Interrupted");
            }

            System.out.println(name + " trying to call A.last()");
            a.last();
        }

        synchronized void last() {
            System.out.println("Inside A.last");
        }
    }

    public static void main(String args[]) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        // Start the threads.
        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop.");
    }
}

