package com.bai.type.flo;

public class TypeCompareTest {
    public static void main(String[] args) {

        Integer i = 42;
        Long l = 42L;
        Double d = 42.0;

        //System.out.println(i == l);  报错
        //System.out.println(i == d);  报错
        //System.out.println(d == l);  报错
        //System.out.println(i.equals(d));  false
        //System.out.println(i.equals(l)); false
        //System.out.println(d.equals(l)); false
        System.out.println(l.equals(42L));



    }
}
