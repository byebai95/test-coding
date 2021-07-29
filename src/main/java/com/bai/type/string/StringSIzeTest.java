package com.bai.type.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class StringSIzeTest {
    public static void main(String[] args) throws UnsupportedEncodingException {

        String str1 = " ";
        System.out.println(str1.length());

        String str2 = "你好！";
        System.out.println(str2.length());
        System.out.println(str2.getBytes("GBK").length);

        String str3 = "-";
        System.out.println(str3.length());
    }
}
