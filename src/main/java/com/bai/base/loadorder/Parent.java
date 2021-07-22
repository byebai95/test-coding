package com.bai.base.loadorder;

public class Parent {
    public Parent() {
        System.out.println("父构造函数");
    }

    {
        System.out.println("父构造块");
    }

    static {
        System.out.println("父静态块");
    }
}
