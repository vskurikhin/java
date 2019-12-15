package su.svn.chap11;

public class DemoJoin {
    public static void main(String args[]) {
        NewThread nt1 = new NewThread("Один");
        NewThread nt2 = new NewThread("Два");
        NewThread nt3 = new NewThread("Три");

        // Start the threads.
        // Запустить потоки исполнения
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Поток Один запущен: " + nt1.t.isAlive());
        System.out.println("Поток Два запущен: " + nt2.t.isAlive());
        System.out.println("Поток Три запущен: " + nt3.t.isAlive());
        // wait for threads to finish
        // ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Поток Один запущен: " + nt1.t.isAlive());
        System.out.println("Поток Два запущен: " + nt2.t.isAlive());
        System.out.println("Поток Три запущен: " + nt3.t.isAlive());

        System.out.println("Главный поток завершен.");
    }
}
