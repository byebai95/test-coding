package com.bai.type.variable;

public class AboutInit {

    public String name;

    public static int age;

    public void check(){
        String address;
        //System.out.println(address);
    }

    public static void checkStatic(){
        int boy;

    }


    public static void main(String[] args) {
        System.out.println(new AboutInit().name);
        System.out.println(age);
    }
}
