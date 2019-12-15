package su.svn.chap11;

public class ExtendThread {

    // Create a second thread by extending Thread
    // Создать второй поток исполнения, расширив класс Thread
    static class NewThread extends Thread {

        NewThread() {
            // Create a new, second thread
            // создать новый поток исполнения
            super("Демонстрационный поток");
            System.out.println("Дочерний поток: " + this);
        }

        // This is the entry point for the second thread.
        // Точка входа во второй поток исполнения
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Дочерний поток: " + i);
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

        nt.start(); // start the thread

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
