package com.bai.algo;

import java.nio.charset.StandardCharsets;

/**
 * 输入一个字符串，求最长回文子串长度
 */
public class StringTest {

    public static void main(String[] args) {
        System.out.println(getMaxLength("aca"));
    }


    public static int getMaxLength(String str){
        int maxLength = 0;
        byte[] strArray = str.toLowerCase().getBytes(StandardCharsets.UTF_8);
        for(int i = 0; i<strArray.length; i++){
            for(int j = i;j<strArray.length;j++){
                //判断是否回文串 ，是获取长度，不是continue
                if(isPalindromicString(strArray,i,j)){
                    int length = j -i +1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }

    private static boolean isPalindromicString(byte[] strArray,int left,int right){
        for(;left<right&&strArray[left]==strArray[right];left++,right--);
        return left >= right;
    }

}
