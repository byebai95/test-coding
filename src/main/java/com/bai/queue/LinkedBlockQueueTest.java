package com.bai.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockQueueTest {
    public static void main(String[] args) {

        BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();

        blockingQueue.add("a");

        System.out.println(blockingQueue.poll());

    }
}
