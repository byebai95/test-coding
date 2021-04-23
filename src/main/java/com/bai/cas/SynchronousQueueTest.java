package com.bai.cas;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class SynchronousQueueTest {
    public static void main(String[] args) throws Exception{

        BlockingQueue<String> blockingQueue = new SynchronousQueue<>();

        new Thread(()->{
            try {
                blockingQueue.put("hello world");
            }catch (Exception e){}
        }).start();


        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(3);
                String str = blockingQueue.take();
                System.out.println(str);
            }catch (Exception e){}
        }).start();

    }
}
