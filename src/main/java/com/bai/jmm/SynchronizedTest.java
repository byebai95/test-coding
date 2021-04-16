package com.bai.jmm;


/**
 * JMM JAVA 内存模型
 * 三大特性：
 *  原子性
 *  可见性
 *  有序性
 *
 * 功能  ：测试 synchronized 原子性
 *
 * 结论： synchronized 保证了原子性
 *
 */

public class SynchronizedTest {

    private  static int count = 0;


    public static void main(String[] args) throws Exception{
        MyThread myThread = new MyThread();

        for(int i=0; i<10; i++){
            new Thread(myThread).start();
        }

        Thread.sleep(3000);

        System.out.println(count);
    }

    static class MyThread implements Runnable{
        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 1000; i++) {
                    count++;
                }
            }
        }
    }

}
