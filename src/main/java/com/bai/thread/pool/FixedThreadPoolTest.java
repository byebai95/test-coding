package com.bai.thread.pool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 实现多线程 4 种方式
 * 1.继承 Thread
 * 2.实现 Runnable (无返回值)
 * 3.实现 Callable （有返回值）
 * 4.线程池
 */

public class FixedThreadPoolTest {
    public static void main(String[] args) {


        /**
         * https://www.cnblogs.com/vince66/p/9325638.html
         *
         * CachedThreadPool
         * FixedThreadPool
         * SingleThreadExecutor
         * ScheduleThreadPool
         * SingleThreadScheduledExecutor
         *
         */

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(5);

        for(int i=0;i<10;i++) {
            fixedThreadPool.submit(() -> {
                System.out.println(Thread.currentThread().getName()+": doing job ");
            });
        }



    }
}
