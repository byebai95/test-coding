package com.bai.jmm;


/**
 * JMM JAVA 内存模型
 * 三大特性：
 *  原子性
 *  可见性
 *  有序性
 *
 * 功能  ：测试 volatile 原子性
 *
 * 结论： volatile 无法保证原子性
 *
 */

public class VolatileTest02 {

    private volatile static int count = 0;


    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();

        Thread t1 = new Thread(myThread);
        Thread t2 = new Thread(myThread);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count);
    }

    static class MyThread implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
        }
    }

}
