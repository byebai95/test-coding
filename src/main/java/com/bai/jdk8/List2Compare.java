package com.bai.jdk8;

import com.bai.jdk8.entity.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 首先按照 id 升序排列， id 相同按照年龄降序
 */

public class List2Compare {

    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student(10,"张三",25),
                new Student(20,"李四",5),
                new Student(20,"王五",30),
                new Student(20,"赵六",22),
                new Student(30,"韩企",29)
        );

        studentList = studentList.parallelStream()
                .sorted(Comparator.comparing(Student::getId).thenComparing(Student::getAge,Comparator.reverseOrder()))
                .collect(Collectors.toList());

        studentList.forEach(System.out::println);
    }
}
