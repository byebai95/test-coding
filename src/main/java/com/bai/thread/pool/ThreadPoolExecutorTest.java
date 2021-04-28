package com.bai.thread.pool;

import java.util.concurrent.*;

/**
 * 线程池核心参数
 *
 * 线程池线程池数量配置：
 * 根据硬件核数确定线程数量
 * cpu 密集型： 核数*2
 * io 密集型： 核数/(1-系数) ，系数一般为 0.9
 *
 *
 */

public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException {

        /**
         * 1. 核心线程数量
         * 2. 最大线程数量
         * 3. 线程存活时间
         * 4. 时间单位
         * 5. 工作队列
         * 6. 线程工厂
         * 7. 拒绝策略
         *      四种拒绝策略
         *       AbortPolicy()  抛弃异常，放弃接受
         *       CallerRunsPolicy() 调用者运行策略
         *       DiscardPolicy()  丢弃任务
         *       DiscardOldestPolicy()  丢弃老任务
         */
       // ExecutorService e1 = new ThreadPoolExecutor(1,10,1, TimeUnit.SECONDS,new ArrayBlockingQueue<>(1));

        ExecutorService e1 = new ThreadPoolExecutor(2, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardPolicy());

        for(int i =0;i<20;i++){
            e1.submit(()->{
                System.out.println(Thread.currentThread().getName()+": doing job");
            });
        }

    }
}
