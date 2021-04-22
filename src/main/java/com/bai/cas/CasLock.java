package com.bai.cas;


import java.util.concurrent.atomic.AtomicReference;

/**
 * 自定义实现乐观锁
 */
public class CasLock {

    private final AtomicReference<Thread> reference = new AtomicReference<Thread>();

    public  void lock(){
        Thread current = Thread.currentThread();
        while (!reference.compareAndSet(null,current)){
        }
        System.out.println(Thread.currentThread().getName()+"成功获取锁");
    }

    public void unlock(){
        System.out.println(Thread.currentThread().getName()+"成功释放锁");
        Thread current = Thread.currentThread();
        reference.compareAndSet(current,null);

    }
}
