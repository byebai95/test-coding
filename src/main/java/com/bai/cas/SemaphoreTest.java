package com.bai.cas;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreTest {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3,true);

        for(int i=1;i<7;i++){
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"成功获取到车位");
                    TimeUnit.SECONDS.sleep(new Random().nextInt(5));
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    System.out.println(Thread.currentThread().getName()+"离开了");
                    semaphore.release();

                }
            },"t"+i).start();
        }


    }
}
