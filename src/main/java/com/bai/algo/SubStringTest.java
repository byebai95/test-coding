package com.bai.algo;

public class SubStringTest {
    public static int checkSubStr(String s1,String s2){
        return s1.indexOf(s2);
    }

    public static boolean checkSubStr2(String s1,String s2){
        return s1.contains(s2);
    }

    public static void main(String[] args) {
        System.out.println(checkSubStr2("abc","ac"));
    }
}
