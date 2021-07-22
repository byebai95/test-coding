package com.bai.thread.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;

/**
 * 所有线程都到达某个点后才继续执行
 *
 * 模拟比赛全部人员到场才开始比赛
 */
public class CyclicBarrierTest {

    private static final CyclicBarrier barrier = new CyclicBarrier(4);


    public static void main(String[] args) throws Exception{

        Thread t1 = new Thread(()->{
            try{
                System.out.println(Thread.currentThread().getName()+":到达");
                barrier.await();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"thread_1");

        Thread t2 = new Thread(()->{
            try{
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+":到达");
                barrier.await();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"thread_2");


        Thread t3 = new Thread(()->{
            try{
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+":到达");
                barrier.await();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"thread_3");

        t1.start();
        t2.start();
        t3.start();
        barrier.await();
        System.out.println("比赛开始。。。");


    }
}
