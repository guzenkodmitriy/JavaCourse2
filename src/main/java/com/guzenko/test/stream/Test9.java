package com.guzenko.test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 'm', 22, 3, 8.3);
        Student student2 = new Student("Maria", 'f', 20, 1, 6.4);
        Student student3 = new Student("Julian", 'm', 22, 3, 8.9);
        Student student4 = new Student("David", 'm', 25, 5, 7);
        Student student5 = new Student("Kate", 'f', 21, 2, 9);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        List<Integer> courses = students.stream()
//                .mapToInt(student -> student.getCourse())
//                .boxed()
//                .collect(Collectors.toList());
        //System.out.println(courses);

        int sum = students.stream().mapToInt(student -> student.getCourse()).sum();
        System.out.println(sum);

        double average = students.stream().mapToDouble(student -> student.getAvgGrade()).average().getAsDouble();
        System.out.println(average);

        int min = students.stream().mapToInt(student -> student.getCourse()).min().getAsInt();
        System.out.println(min);

        int max = students.stream().mapToInt(student -> student.getCourse()).max().getAsInt();
        System.out.println(max);
    }
}
