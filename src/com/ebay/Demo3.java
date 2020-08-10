package com.ebay;

/**
 * @Description
 * @ClassName Demo3
 * @Author Ly
 * @date 2020.08.07 15:35
 */
public class Demo3 extends Thread {
    volatile static Integer cout = 0;
    static Object lock = new Object();
    int max = 100;

    public static void main(String[] args) {
        Thread thread = new Demo3();
        Thread thread2 = new Demo3();
        thread.start();
        thread2.start();
    }

    @Override
    public void run() {
        while (cout <= 100) {
            synchronized (lock) {
                System.out.println(this.getName() + ":" + cout++);
                lock.notifyAll();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
