package com.bai.collection;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {
    public static void main(String[] args) {

        WeakHashMap<Object,String> map = new WeakHashMap<>();

        Object o1 = new Object();
        Object o2 =  new Object();
        map.put(o1,"123456");
        map.put(o2,"123456");

        System.out.println(map);

        o1 = null;
        System.gc();
        System.out.println(map);
    }
}
