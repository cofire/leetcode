package cofire.concurrent.lock;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(this.getName() + " running");
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(this.getName() + " end");
                    semaphore.release();
                }
            }.start();
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
