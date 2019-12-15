package su.svn.chap11;

public class MultiThreadDemo {
    public static void main(String args[]) {
        NewThread nt1 = new NewThread("Один");
        NewThread nt2 = new NewThread("Два");
        NewThread nt3 = new NewThread("Три");

        // Start the threads.
        // Запустить потоки исполнения
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        try {
            // wait for other threads to end
            // ожидать завершения потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен.");
    }
}
