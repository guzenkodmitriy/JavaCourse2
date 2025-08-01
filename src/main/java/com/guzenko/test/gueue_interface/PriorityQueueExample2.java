package com.guzenko.test.gueue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        Student student1 = new Student("Max", 29);
        Student student2 = new Student("Lando", 25);
        Student student3 = new Student("Oscar", 21);
        Student student4 = new Student("Mike", 27);
        Student student5 = new Student("Jorge", 21);
        Student student6 = new Student("Alex", 25);

        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(student1);
        pq.add(student2);
        pq.add(student3);
        pq.add(student4);
        pq.add(student5);
        pq.add(student6);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
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
