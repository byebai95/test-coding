package com.bai.type.consruct;

public class SonTest extends ParentTest{
    public SonTest() {
        System.out.println("Son--构造函数");
    }
    {
        System.out.println("Son--方法块");
    }
    static {
        System.out.println("Son--static方法块");
    }

    public static void main(String[] args) {
        new SonTest();
    }
}
