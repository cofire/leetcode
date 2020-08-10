package com.test;

/**
 * @Description
 * @ClassName Consumer
 * @Author Ly
 * @date 2020.08.03 19:51
 */
public class Consumer implements Runnable {
    private Storage storage;

    public Consumer() {
    }

    public Consumer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                storage.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

