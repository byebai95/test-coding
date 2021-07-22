package com.bai.thread.interview;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {

    public static Lock lock = new ReentrantLock();
    public static volatile int state = 0;

    public static class PrintA extends Thread{
        @Override
        public void run() {
            for(int i=0;i<5;){
                try{
                    lock.lock();
                    while(state%3==0){
                        System.out.print("a");
                        state++;
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    public static class PrintB extends Thread{
        @Override
        public void run() {
            for(int i=0;i<5;){
                try{
                    lock.lock();
                    while(state%3==1){
                        System.out.print("b");
                        state++;
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        }
    }

    public static class PrintC extends Thread{
        @Override
        public void run() {
            for(int i=0;i<5;){
                try{
                    lock.lock();
                    while(state%3==2){
                        System.out.print("c");
                        state++;
                        i++;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        }
    }

    public static void main(String[] args) {
        new PrintA().start();
        new PrintB().start();
        new PrintC().start();
    }
}
