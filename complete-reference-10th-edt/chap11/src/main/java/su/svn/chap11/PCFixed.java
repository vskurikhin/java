package su.svn.chap11;

public class PCFixed {

    public static void main(String args[]) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        // Start the threads.
        // Запустить потоки исполнения
        p.t.start();
        c.t.start();

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}

