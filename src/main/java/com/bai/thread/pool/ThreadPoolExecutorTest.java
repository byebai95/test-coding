package com.bai.thread.pool;

import java.util.concurrent.*;

/**
 * 线程池核心参数
 */

public class ThreadPoolExecutorTest {
    public static void main(String[] args) {

        /**
         * 1. 核心线程数量
         * 2. 最大线程数量
         * 3. 线程存活时间
         * 4. 时间单位
         * 5. 工作队列
         * 6. 线程工厂
         * 7. 拒绝策略
         */
        ExecutorService e1 = new ThreadPoolExecutor(10,20,10, TimeUnit.SECONDS,new LinkedBlockingQueue<>());

     //   ExecutorService e3 = new ThreadPoolExecutor(1, 2, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        for(int i =0;i<100;i++){
            e1.submit(()->{
                System.out.println(Thread.currentThread().getName()+": doing job");
            });
        }

    }
}
