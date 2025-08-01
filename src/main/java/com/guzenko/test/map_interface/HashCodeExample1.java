package com.guzenko.test.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("David", "Davidson", 3);
        Student student2 = new Student("John", "Johnson", 4);
        Student student3 = new Student("Kate", "Stewart", 1);
        map.put(student1, 7.5);
        map.put(student2, 8.5);
        map.put(student3, 9.5);
        System.out.println(map);
        Student student4 = new Student("David", "Davidson", 3);
        boolean result = map.containsKey(student4);
//        System.out.println(result);
//        System.out.println(student1.equals(student4));
//        System.out.println(student1.hashCode());
//        System.out.println(student4.hashCode());

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Map <Integer, String> map2 = new HashMap<>(16, 0.75f);
    }
}

final class Student implements Comparable<Student> {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
