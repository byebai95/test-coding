package com.bai.base.loadorder;

public class Child extends Parent{

    public Child() {
        System.out.println("子构造函数");
    }

    {
        System.out.println("子构造块");
    }

    static {
        System.out.println("子静态块");
    }

    public static void main(String[] args) {
        new Child();
    }
}
