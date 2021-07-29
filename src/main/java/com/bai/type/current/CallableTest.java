package com.bai.type.current;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableTest {
    public static void main(String[] args) {


        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(()->{
            System.out.println("test callable");
        });

        executorService.shutdown();


    }
}
