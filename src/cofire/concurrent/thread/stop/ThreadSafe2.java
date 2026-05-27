package cofire.concurrent.thread.stop;

public class ThreadSafe2 extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("now:" + System.currentTimeMillis());
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadSafe2 threadSafe = new ThreadSafe2();
        threadSafe.start();
        sleep(3000);
        threadSafe.interrupt();
    }
}
