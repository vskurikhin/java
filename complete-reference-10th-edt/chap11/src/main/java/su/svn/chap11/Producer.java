package su.svn.chap11;

public class Producer implements Runnable {
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

