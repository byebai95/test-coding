package com.bai.thread.countdownlatch;


import java.util.concurrent.CountDownLatch;

/**
 * 线程 A 等待线程 B 执行到某个点才继续执行
 */
public class CountDownLatchTest {

    private static final CountDownLatch countDownLatch = new CountDownLatch(1);


    public static void main(String[] args) throws Exception{


        Thread t1 = new Thread(()->{
                try {
                    System.out.println(Thread.currentThread().getName() + ":张三想爬山");
                    countDownLatch.await();
                    System.out.println(Thread.currentThread().getName() + ":张三开始爬山");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        },"thread_1");


        Thread t2 = new Thread(()->{
            try{
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+":工作人员准备好山");
                countDownLatch.countDown();
            }catch (Exception e){
                e.printStackTrace();
            }
        },"thread_2");

        t1.start();
        t2.start();
    }
}
