package su.svn.chap11;

public class ThreadDemo {

    // Create a second thread.
    // Создать второй поток исполнения, расширив класс Thread
    static class NewThread implements Runnable {
        Thread t;

        NewThread() {
            // Create a new, second thread
            // создать новый поток исполнения
            t = new Thread(this, "Демонстрационный поток");
            System.out.println("Дочерний поток: " + t);
        }

        // This is the entry point for the second thread.
        // Точка входа во второй поток исполнения
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Child Thread: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Дочерний поток прерван.");
            }
            System.out.println("Дочерний поток завершен.");
        }
    }

    public static void main(String args[]) {
        NewThread nt = new NewThread(); // create a new thread / создать новый поток исполнения

        nt.t.start(); // Start the thread / запустить поток на исполнение

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Главный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен.");
    }
}
