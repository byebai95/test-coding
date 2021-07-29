package com.bai.type.current;

import java.util.concurrent.TimeUnit;

public class RunnableTest {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread t1 running");
        });


        Thread t2 = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("thread t2 running");
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }
}
