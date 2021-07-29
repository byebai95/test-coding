package com.bai.thread.wait;

public class WaitTest {

    public static void main(String[] args) throws Exception{

        final Object object = new Object();
        Thread t1 = new Thread(()->{
           synchronized (object){
               try{
                   object.wait();
                   System.out.println("thread 1");
               }catch (Exception e){

               }
           }
        });

        t1.start();
        Thread.sleep(1000);

        Thread t2 = new Thread(()->{
            synchronized (object) {
                try {
                    object.notifyAll();
                    System.out.println("thread 2");
                } catch (Exception e) {

                }
            }
        });
        t2.start();


    }
}
