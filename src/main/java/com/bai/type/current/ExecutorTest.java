package com.bai.type.current;

import java.util.concurrent.*;

public class ExecutorTest {

    public static void main(String[] args) throws Exception {


        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future future = executor.submit(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("callable run");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("main run");
        future.get();
        if(future.isDone()){
            System.out.println("future finished");
        }
        executor.shutdown();
    }

    static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("callable run");
            return "success";
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println("runnable run");
            } catch (InterruptedException e) {

            }
        }
    }

}
