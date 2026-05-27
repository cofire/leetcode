package cofire.concurrent.thread.stop;

public class ThreadSafe extends Thread {
    public volatile boolean end = false;

    @Override
    public void run() {
        while (!end) {
            System.out.println("now:" + System.currentTimeMillis());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafe threadSafe = new ThreadSafe();
        threadSafe.start();
        sleep(3000);
        threadSafe.end = true;
    }
}
