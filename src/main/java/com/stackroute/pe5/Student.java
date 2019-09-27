package com.stackroute.pe5;

import java.util.*;

public class Student implements Comparable<Student>{


    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    @Override
    public int compareTo(Student student) {
        int compareAge=((Student)student).getAge();
        return compareAge-this.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}