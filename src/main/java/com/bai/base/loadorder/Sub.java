package com.bai.base.loadorder;

public class Sub extends Base{

    public String name = "sub";

    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Base base = new Sub();
    }
}
