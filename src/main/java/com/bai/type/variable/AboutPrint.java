package com.bai.type.variable;

public class AboutPrint {
    public int x;
    public static void main(String[] args) {
        //System.out.println(x); 报错，静态方法不能引用非静态成员
        //System.out.println(new AboutPrint().x);  输出 ： 0
    }
}
