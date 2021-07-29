package com.bai.type.current;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class CurrentHashMapTest {
    public static void main(String[] args) {

        ConcurrentHashMap map = new ConcurrentHashMap();

        ConcurrentSkipListMap skipListMap = new ConcurrentSkipListMap();

        skipListMap.put("5","a");

        skipListMap.put("4","b");

        skipListMap.put("6","c");

        skipListMap.put("1","e");

        System.out.println(skipListMap);



    }
}
