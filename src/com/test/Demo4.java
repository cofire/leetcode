package com.test;

/**
 * @Description
 * @ClassName Demo4
 * @Author Ly
 * @date 2020.08.03 19:53
 */
public class Demo4 {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread p1 = new Thread(new Producer(storage));
        p1.setName("p1");
        Thread p2 = new Thread(new Producer(storage));
        p2.setName("p2");
        Thread c1 = new Thread(new Consumer(storage));
        c1.setName("c1");
        Thread c2 = new Thread(new Consumer(storage));
        c2.setName("c2");
        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
