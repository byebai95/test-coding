package com.bai.algo;


public class StringTest02 {

    public static void main(String[] args) {
        System.out.println(getMaxSubStr("abaca"));
    }


    public static String getMaxSubStr(String s){
        int maxLength = 0;
        int left = 0;
        int right = 0;
        byte[] strArray = s.toLowerCase().getBytes();
        for(int i = 0; i<strArray.length; i++){
            for(int j = i;j<strArray.length;j++){
                //判断是否回文串 ，是获取长度，不是continue
                if(checkStrArray(strArray,i,j)){
                    int length = j -i +1;
                    if(maxLength<length){
                        maxLength = length;
                        left = i;
                        right = j;
                    }
                }
            }
        }
        return s.substring(left,right+1);
    }

    private static boolean checkStrArray(byte[] strArray,int left,int right){
        for(;left<right&&strArray[left]==strArray[right];left++,right--);
        return left >= right;
    }
}
