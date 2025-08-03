package com.guzenko.test.set_interface;


import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student student1 = new Student("Max", 29);
        Student student2 = new Student("Lando", 25);
        Student student3 = new Student("Oscar", 21);
        Student student4 = new Student("Mike", 27);
        Student student5 = new Student("Jorge", 21);
        Student student6 = new Student("Alex", 25);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students.subSet(student5, student6));
        System.out.println(student3.equals(student5));
        System.out.println(student3.hashCode() == student5.hashCode());
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
