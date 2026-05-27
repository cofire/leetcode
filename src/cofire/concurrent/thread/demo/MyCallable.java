package cofire.concurrent.thread.demo;

import java.util.concurrent.*;

public class MyCallable implements Callable<String> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main thread：" + Thread.currentThread().getName());
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        Future<String> future = newFixedThreadPool.submit(new MyCallable());
        System.out.println(System.currentTimeMillis());
        String result = future.get();
        System.out.println(result);
        System.out.println(System.currentTimeMillis());
        newFixedThreadPool.shutdown();
    }

    @Override
    public String call() throws Exception {
        System.out.println("Call thread：" + Thread.currentThread().getName());
        Thread.sleep(5000);
        return "call sample";
    }
}
