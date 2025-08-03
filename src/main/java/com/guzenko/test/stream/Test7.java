package com.guzenko.test.stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
    public static void main(String[] args) {
        Student student1 = new Student("John", 'm', 22, 3, 8.3);
        Student student2 = new Student("Maria", 'f', 20, 1, 6.4);
        Student student3 = new Student("Julian", 'm', 22, 3, 8.9);
        Student student4 = new Student("David", 'm', 25, 5, 7);
        Student student5 = new Student("Kate", 'f', 21, 2, 9);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Applied mathematics");
        f1.addStudentToFaculty(student1);
        f1.addStudentToFaculty(student2);
        f1.addStudentToFaculty(student3);

        f2.addStudentToFaculty(student4);
        f2.addStudentToFaculty(student5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty ->
            faculty.getStudentsOnFaculty()
                    .stream()).forEach(student -> System.out.println(student.getName()));

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        studentList.add(student5);
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student student) {
        this.studentsOnFaculty.add(student);
    }

    public String getName() {
        return name;
    }
}

