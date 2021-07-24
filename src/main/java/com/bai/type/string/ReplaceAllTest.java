package com.bai.type.string;

public class ReplaceAllTest {
    public static void main(String[] args) {
        String str1 = "com.jd.".replaceAll(".","/")+"my.class";
        System.out.println(str1);

        String str2 = "com.jd.".replaceAll("\\.","/")+"my.class";
        System.out.println(str2);

        String str3 = "com.jd.".replace(".","/")+"my.class";
        System.out.println(str3);
    }
}
