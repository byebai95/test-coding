package com.bai.type.consruct;

public class LoadTest {



    static LoadTest loadTest1 = new LoadTest();
    static LoadTest loadTest2 = new LoadTest();

    static {
        System.out.println("静态块");
    }

    public LoadTest() {
        System.out.println("构造方法");
    }

    {
        System.out.println("构造块");
    }


    public static void main(String[] args) {

        LoadTest loadTest1 = new LoadTest();
        LoadTest loadTest2 = new LoadTest();


    }
}
