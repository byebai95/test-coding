package com.bai.cas;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {

    public static void main(String[] args) throws Exception{

        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);


        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));

//        System.out.println(blockingQueue.remove("c"));
//        System.out.println(blockingQueue.add("d"));
//        System.out.println(blockingQueue);
//        System.out.println(blockingQueue.element());
//
//        System.out.println(blockingQueue.offer("e"));
//        System.out.println(blockingQueue);
//
//        System.out.println(blockingQueue.peek());
//        System.out.println(blockingQueue);
//
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue);

      //  blockingQueue.put("a");
        blockingQueue.offer("a",2, TimeUnit.SECONDS);
        System.out.println(blockingQueue);

    }

}
