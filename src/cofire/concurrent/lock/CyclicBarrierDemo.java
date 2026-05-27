package cofire.concurrent.lock;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        for (int i = 0; i < 10; i++) {
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
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (BrokenBarrierException e) {
                        throw new RuntimeException(e);
                    }

                }
            }.start();
        }
        System.out.println(Thread.currentThread().getName() + " end");
    }
}
