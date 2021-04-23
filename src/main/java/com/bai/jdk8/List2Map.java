package com.bai.jdk8;

import com.bai.jdk8.entity.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 将实体的某2个字段装入 map
 */

public class List2Map {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1,"",20),
                new Student(2,"",30),
                new Student(3,"",40),
                new Student(4,"",50)
        );

        Map<Integer,Integer> studentMap = list.stream()
                .collect(Collectors.toMap(Student::getId,Student::getAge));


        for(Map.Entry<Integer,Integer> entry : studentMap.entrySet()){
            System.out.println(entry);
        }

    }
}
