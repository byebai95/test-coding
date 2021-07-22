package com.bai.base;

import java.util.Date;

public class SuperTest extends Date {

    public void test(){
        System.out.println(super.getClass().getName());
    }
    public static void main(String[] args) {
        new SuperTest().test();
    }
}
