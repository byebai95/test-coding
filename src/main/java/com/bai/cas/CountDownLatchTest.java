package com.bai.cas;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTest {

    public static void main(String[] args) throws Exception{

        CountDownLatch latch = new CountDownLatch(4);

        for(int i=1;i<5;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"离开了");
                latch.countDown();



                try{
                    TimeUnit.SECONDS.sleep(1);}catch (Exception e){}
            },"t"+i).start();
        }

        //主线程进入等待状态，直到 latch 值为 0
        latch.await();
        System.out.println("门锁了");

    }

}
