package com.bai.type.trycatch;

public class TryTest {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test(){
        int i = 1;
        try{
            System.out.println(i);
            int j = 10/0;
            return ++i;
        }catch (Exception e){
            System.out.println(i);
            return ++i;
        }finally {
            ++i;
            System.out.println(i);
        }
    }
}
