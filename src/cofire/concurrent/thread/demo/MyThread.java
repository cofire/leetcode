package cofire.concurrent.thread.demo;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("my thread：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main thread：" + Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
