package su.svn.chap11;

//  listing 8
// An incorrect implementation of a producer and consumer.
// Неправильная реализация поставщика и потребителя

public class PC {
    static class Q {
        int n;

        synchronized int get() {
            System.out.println("Получено: " + n);
            return n;
        }

        synchronized void put(int n) {
            this.n = n;
            System.out.println("Отправлено: " + n);
        }
    }

    static class Producer implements Runnable {
        Q q;
        Thread t;

        Producer(Q q) {
            this.q = q;
            t = new Thread(this, "Поставщик");
        }

        public void run() {
            int i = 0;

            while (true) {
                q.put(i++);
            }
        }
    }

    static class Consumer implements Runnable {
        Q q;
        Thread t;

        Consumer(Q q) {
            this.q = q;
            t = new Thread(this, "Потребитель");
        }

        public void run() {
            while (true) {
                q.get();
            }
        }
    }

    public static void main(String args[]) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        // Start the threads.
        // Запустить потоки исполнения
        p.t.start();
        c.t.start();

        System.out.println("Для остановки нажмите Ctrl+C.");
    }
}
