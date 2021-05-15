package com.bai.type;

public class StringTest {
    public static void main(String[] args) {

        String s1 = "abc";

        String s2 = new String("abc");

        String s3 = "a"+"bc";
        System.out.println(s1 == s2);
        System.out.println(s1 == s2.intern());

        System.out.println(s1 == s3);

    }
}
