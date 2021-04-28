package com.bai.thread.pool;

/**
 * 多线程的死锁 : 模拟死锁 。
 *
 *  如何排查死锁？ java/bin jps 与 jstack
 *
 *  jps -l 查看进程号(cd 到文件目录)
 *  jstack pid 查询堆栈信息
 *
 */

public class DeadLockTest {

    public static final Object o1 = new Object();
    public static final Object o2 = new Object();

    public static void main(String[] args){

        new Thread(DeadLockTest::m1,"t1").start();
        new Thread(DeadLockTest::m2,"t2").start();
    }


    public static void m1(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        synchronized(o1){
            System.out.println(Thread.currentThread().getName()+": m1");
            m2();
        }
    }

    public static void m2(){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        synchronized(o2){
            System.out.println(Thread.currentThread().getName()+": m2");
            m1();
        }
    }


}
