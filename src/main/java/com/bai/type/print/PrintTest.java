package com.bai.type.print;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个线程轮流输出 abc ,共三次即 abcabcabc
 */
public class PrintTest {

    private static final ReentrantLock lock = new ReentrantLock();
    private static AtomicInteger count = new AtomicInteger(0);

    static class PrintA extends Thread{
        @Override
        public void run() {
            for(int i =0;i<3;) {
                try {
                    lock.lock();
                    while (count.get() % 3 == 0) {
                        System.out.print("A");
                        count.incrementAndGet();
                        i++;
                    }
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    static class PrintB extends Thread{
        @Override
        public void run() {
            for(int i=0;i<3;) {
                try {
                    lock.lock();
                    while (count.get()%3==1) {
                        System.out.print("B");
                        count.incrementAndGet();
                        i++;
                    }
                }finally {
                    lock.unlock();
                }
            }
        }
    }

    static class PrintC extends Thread{
        @Override
        public void run() {
            for(int i=0;i<3;) {
                try {
                    lock.lock();
                    while (count.get()%3==2) {
                        System.out.print("C");
                        count.incrementAndGet();
                        i++;
                    }
                } finally {
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
