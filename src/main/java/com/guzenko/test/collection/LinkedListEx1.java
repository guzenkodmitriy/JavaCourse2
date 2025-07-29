package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx1 {
    public static void main(String[] args) {
        Student2 student1 = new Student2("John", 3);
        Student2 student2 = new Student2("Julian", 2);
        Student2 student3 = new Student2("Koba", 1);
        Student2 student4 = new Student2("Mike", 5);
        Student2 student5 = new Student2("David", 4);


        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(student1);
        student2LinkedList.add(student2);
        student2LinkedList.add(student3);
        student2LinkedList.add(student4);
        student2LinkedList.add(student5);


        Student2 student6 = new Student2("Mary", 2);
        System.out.println(student2LinkedList);
        Student2 student7 = new Student2("Gal", 5);
        student2LinkedList.add(1, student7);
        System.out.println(student2LinkedList);
        student2LinkedList.remove(3);
        System.out.println(student2LinkedList);


    }
}

class Student2 {
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}