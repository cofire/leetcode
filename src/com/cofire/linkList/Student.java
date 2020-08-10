package com.cofire.linkList;

/**
 * @Description
 * @ClassName Student
 * @Author Ly
 * @date 2020.08.10 21:58
 */
public class Student {
    String name;
    String age;

    Student() {

    }

    Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
