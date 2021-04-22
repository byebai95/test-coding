package com.bai.jmm;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * JMM JAVA 内存模型
 * 三大特性：
 *  原子性
 *  可见性
 *  有序性
 *
 * 通过原子类实现原子性
 */

public class VolatileTest03 {

    private static final AtomicInteger count = new AtomicInteger(0);


    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();

        for(int i=0; i<10; i++){
            new Thread(myThread).start();
        }

        Thread.sleep(3000);

        System.out.println(count.get());
    }

    static class MyThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                count.getAndIncrement();
            }
        }
    }

}
