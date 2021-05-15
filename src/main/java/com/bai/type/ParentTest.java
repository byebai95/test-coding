package com.bai.type;

public class ParentTest {
    public ParentTest() {
        System.out.println("Parent--构造函数");
    }
    {
        System.out.println("Parent--方法块");
    }
    static {
        System.out.println("Parent--static构造函数");
    }
}
