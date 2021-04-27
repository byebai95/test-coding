package com.bai.cas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/**
 * Lock 锁之 Condition 唤醒特定线程
 */


public class LockTest {

    public static void main(String[] args) throws InterruptedException{

        Resource resource = new Resource();
        new Thread(()->{
            for(int i=0;i<=10;i++){
                resource.print5();
            }
        },"A").start();

        new Thread(()->{
            for(int i=0;i<=10;i++){
                resource.print10();
            }
        },"B").start();

        new Thread(()->{
            for(int i=0;i<=10;i++){
                resource.print15();
            }
        },"C").start();

    }



}

class Resource{
    private int num = 1;
    private final Lock lock = new ReentrantLock();
    private final Condition c1 = lock.newCondition();
    private final Condition c2 = lock.newCondition();
    private final Condition c3 = lock.newCondition();

    public void print5(){
        lock.lock();
        try{
            if(num != 1){
                c1.await();
            }
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            num = 2;
            c2.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }


    public void print10(){
        lock.lock();
        try{
            if(num != 2){
                c2.await();
            }
            for(int i=1;i<=10;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            num = 3;
            c3.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }



    public void print15(){
        lock.lock();
        try{
            if(num != 3){
                c3.await();
            }

            for(int i=1;i<=15;i++){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            num = 1;
            c1.signal();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
