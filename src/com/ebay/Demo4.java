package com.ebay;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description
 * @ClassName Demo4
 * @Author Ly
 * @date 2020.08.09 20:27
 */
public class Demo4 implements Runnable {
    public static Object lock = new Object();
    volatile static Integer cout = 0;
    int max = 100;

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Demo4());
        thread1.start();
        Thread thread2 = new Thread(new Demo4());
        thread2.start();
    }

    @Override
    public void run() {
        while (cout <= 100) {
            synchronized (lock) {
                System.out.println(Thread.currentThread().getName() + ":" + cout++);
                lock.notifyAll();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * @Description
     * @ClassName Demo5
     * @Author Ly
     * @date 2020.08.09 20:45
     */
    public static class Demo5 implements Callable<String> {

        public static void main(String[] args) throws ExecutionException, InterruptedException {
            Demo5 demo5 = new Demo5();
            FutureTask futureTask = new FutureTask(demo5);
            Thread thread = new Thread(futureTask);
            thread.start();
            futureTask.get();

        }

        @Override
        public String call() throws Exception {
            System.out.println("call");
            return "";
        }
    }
}
