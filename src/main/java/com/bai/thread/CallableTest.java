package com.bai.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyCallable implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+": test done");
        return 100;
    }
}

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
        Thread t1 = new Thread(futureTask,"t1");
        t1.start();
        int res01 = 500;
        System.out.println(futureTask.isDone());

        System.out.println(futureTask.get() + res01);

        System.out.println(futureTask.isDone());
    }

}
