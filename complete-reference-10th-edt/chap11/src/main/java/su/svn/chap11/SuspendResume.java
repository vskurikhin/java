package su.svn.chap11;

public class SuspendResume {
    public static void main(String args[]) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");

        // Start the threads.
        // Запустить потоки исполнения
        ob1.t.start();
        ob2.t.start();

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Приостановка потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Возобновление потока Один");
            ob2.mysuspend();
            System.out.println("Приостановка потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Возобновление потока Два");
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        // wait for threads to finish
        // ожидать завершения потоков исполнения
        try {
            System.out.println("Ожидание завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Главный поток прерван");
        }

        System.out.println("Главный поток завершен.");
    }
}
