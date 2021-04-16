package com.bai.jmm;

import java.util.concurrent.TimeUnit;

/**
 * JMM JAVA 内存模型
 * 三大特性：
 *  原子性
 *  可见性
 *  有序性
 *
 * 功能  ：测试 volatile 可见性
 *
 */

public class VolatileTest {

    private static volatile  boolean flag = true;

    public static void main(String[] args) {
        new Thread01().start();

        new Thread02().start();
    }

    static class Thread01 extends Thread{
        @Override
        public void run() {
            while (flag){

            }
           System.out.println("Thread01 执行结束");
        }
    }

    static class Thread02 extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
            flag = false;
            System.out.println("Thread02 执行结束");
        }
    }

}
