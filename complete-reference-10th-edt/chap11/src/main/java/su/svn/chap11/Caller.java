package su.svn.chap11;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    // synchronize calls to call()
    // синхронизированные вызовы метода call()
    public void run() {
        synchronized (target) { // synchronized block / синхронизированный блок
            target.call(msg);
        }
    }
}

