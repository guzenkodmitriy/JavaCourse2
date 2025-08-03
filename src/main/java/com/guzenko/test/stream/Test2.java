package com.guzenko.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 'm', 22, 3, 8.3);
        Student student2 = new Student("Maria", 'f', 20, 1, 6.4);
        Student student3 = new Student("Julian", 'm', 22, 3, 8.9);
        Student student4 = new Student("David", 'm', 25, 5, 7);
        Student student5 = new Student("Kate", 'f', 21, 2, 9);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        //studentList = studentList.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).collect(Collectors.toList());
        studentList.stream()
                .map(student ->
                {
                    student.setName(student.getName().toUpperCase());
                    return student;
                })
                .filter(student -> student.getGender() == 'f')
                .sorted((a , b) -> a.getAge() - b.getAge())
                .forEach(System.out::println);

        System.out.println(studentList);
//
//        studentList = studentList.stream().filter(student ->
//                student.getAge() > 22 && student.getAvgGrade() < 7.2).collect(Collectors.toList());
//
//        System.out.println(studentList);

        //Stream<Student> stream = Stream.of(student1, student2, student3, student4, student5);
        //stream.filter()
    }
}

class Student {
    private String name;
    private char gender;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char gender, int age, int course, double avgGrade) {
        this.setName(name);
        this.setGender(gender);
        this.setAge(age);
        this.setCourse(course);
        this.setAvgGrade(avgGrade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
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
