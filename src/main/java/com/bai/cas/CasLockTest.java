package com.bai.cas;

/**
 * 测试乐观锁
 */

public class CasLockTest {

    public static CasLock casLock = new CasLock();

    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            new Thread(CasLockTest::m1,"t"+i).start();
        }
    }

    public static void m1(){
        casLock.lock();
        System.out.println("do something");
        casLock.unlock();
    }

}
