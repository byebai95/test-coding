package com.bai.jvm;

public class GcXXTest {
    public static void main(String[] args) throws Exception{

        System.out.println("Hello");

        Thread.sleep(Integer.MAX_VALUE);


        /**
         * -Xmx 最大堆内存
         * -Xms 初始化堆内存
         * -Xss 栈内存
         * -Xmn 年轻代内存
         *
         * -XX:MetaspaceSize 元空间大小
         *
         * java/bin 命令行工具
         *
         * jps 查询进程号
         * jstack 查询堆栈信息
         * jinfo 查询 jvm 信息
         *      -flag
         *
         * java -XX:+PrintFlagsInitial 打印 jvm 初始化信息
         *
         */

    }
}
