package com.guzenko.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test8 {
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

//        Map<Integer, List<Student>> map = studentList.stream().map(student -> {
//                    student.setName(student.getName().toUpperCase());
//                    return student;})
//                .collect(Collectors.groupingBy(student -> student.getCourse()));
//
//        for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        Map<Boolean, List<Student>> map =
                studentList.stream().collect(Collectors.partitioningBy(student -> student.getAvgGrade() >= 8));

        for (Map.Entry<Boolean, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
