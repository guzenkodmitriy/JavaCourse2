package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 'm', 22, 3, 8.3);
        Student student2 = new Student("Maria", 'f', 20, 1, 6.4);
        Student student3 = new Student("Julian", 'm', 22, 3, 8.9);
        Student student4 = new Student("David", 'm', 25, 5, 7);
        Student student5 = new Student("Kate", 'f', 21, 2, 9);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        Student student6 = new Student("Kate", 'f', 21, 2, 9);
        int index = students.indexOf(student6);
        System.out.println(index);
//        students.remove(student6);
//        System.out.println(students);
    }
}

class Student {
    private String name;
    private char gender;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char gender, int age, int course, double avgGrade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gender == student.gender && age == student.age && course == student.course && Double.compare(avgGrade, student.avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, age, course, avgGrade);
    }
}
