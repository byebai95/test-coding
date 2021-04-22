package com.bai.cas;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

    public static void main(String[] args) {


        CyclicBarrier barrier = new CyclicBarrier(7,()->{
            System.out.println("神龙降世");
        });

        for(int i = 1; i<8 ;i++){
            int finalI = i;
            new Thread(()->{
                System.out.println("收集到第"+ finalI +"号龙珠");
                try {
                    barrier.await();
                }catch (Exception e){

                }
            },"thread"+i).start();
        }
    }
}
