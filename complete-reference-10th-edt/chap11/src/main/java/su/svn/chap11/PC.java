package su.svn.chap11;

//  listing 8
// An incorrect implementation of a producer and consumer.

public class PC {
    static class Q {
        int n;

        synchronized int get() {
            System.out.println("Got: " + n);
            return n;
        }

        synchronized void put(int n) {
            this.n = n;
            System.out.println("Put: " + n);
        }
    }

    static class Producer implements Runnable {
        Q q;
        Thread t;

        Producer(Q q) {
            this.q = q;
            t = new Thread(this, "Producer");
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
            t = new Thread(this, "Consumer");
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
        p.t.start();
        c.t.start();

        System.out.println("Press Control-C to stop.");
    }
}
