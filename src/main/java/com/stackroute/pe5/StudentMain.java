package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentMain {
    public void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of students' details you want to enter...Enter more than 5 ");
        int n = obj.nextInt();
        obj.nextLine();

        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of student "+ (i+1)+" in the order of id name age. Press enter for every attribute");
            students.add(new Student(obj.nextInt(),obj.nextLine(),obj.nextInt()));
        }
        System.out.println(students);


        //Collections.sort();

    }
}

