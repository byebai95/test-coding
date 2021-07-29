package com.bai.type.current;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTest {
    public static void main(String[] args) {
        FutureTask task = new FutureTask(new MyCallable());
        Thread t = new Thread(task);
        t.start();
        System.out.println(task.isDone());
        System.out.println("main run");
    }

    static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("callable run");
            return "success";
        }
    }
}
