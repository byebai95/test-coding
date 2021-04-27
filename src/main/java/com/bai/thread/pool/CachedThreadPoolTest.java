package com.bai.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolTest {
    public static void main(String[] args) {

        ExecutorService fixedThreadPool = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++) {
            fixedThreadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName()+": doing job ");
            });
        }

    }
}
