package com.bai.type.current;

public class ThreadTest {
    public static void main(String[] args) {

        Thread t = new MyThread();
        t.start();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("thread running");
        }
    }
}
