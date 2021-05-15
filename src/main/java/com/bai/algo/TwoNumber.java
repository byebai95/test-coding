package com.bai.algo;

public class TwoNumber {

    /**
     * 辗转相除求最大公约数
     * @param n
     * @param m
     * @return
     */
    public static int getMaxCommonNum(int x,int y){
        int n = y;
        while( x%y != 0 ){
            n = x%y;
            x = y;
            y = n;
        }
        return n;
    }

    public static int getMin(int x,int y){
        return x*y/getMaxCommonNum(x,y);
    }

    public static void main(String[] args) {
        System.out.println(getMaxCommonNum(10,15));

        System.out.println(getMin(10,15));
    }
}
