package cofire.concurrent.thread.demo;

public class MyRunable implements Runnable {
    @Override
    public void run() {
        System.out.println("my thread：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Main thread：" + Thread.currentThread().getName());
        MyRunable myThread = new MyRunable();
        new Thread(myThread).start();
    }
}
