package cofire.concurrent.lock;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName() + " running");
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.getName() + " end");
                latch.countDown();
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println(this.getName() + " running");
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.getName() + " end");
                latch.countDown();
            }
        }.start();
        System.out.println(Thread.currentThread().getName() + " running");
        latch.await();
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
