package com.bai.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


public class CallableTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<Integer>(new MyCallable());
        Thread t1 = new Thread(futureTask,"t1");
        Thread t2 = new Thread(futureTask,"t2");

        // 只执行一次
        t1.start();
        t2.start();
        int res01 = 500;

        System.out.println(futureTask.isDone());

        System.out.println(futureTask.get() + res01);

        System.out.println(futureTask.isDone());
    }

}
