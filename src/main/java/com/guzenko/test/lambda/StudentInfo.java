package com.guzenko.test.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
//    void printStudentsOverGrade(ArrayList<Student> students, double grade) {
//        for (Student student : students) {
//            if(student.avgGrade > grade) {
//                System.out.println(student);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> students, int age) {
//        for (Student student : students) {
//            if(student.age < age) {
//                System.out.println(student);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> students, int age, double grade, char gender) {
//        for (Student student : students) {
//            if(student.age > age && student.gender == gender && student.avgGrade < grade) {
//                System.out.println(student);
//            }
//        }
//    }

    void testStudents(ArrayList<Student> students, Predicate<Student> studentChecks) {
        for (Student student : students) {
            if (studentChecks.test(student)) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {

        Student student1 = new Student("Max",'m', 22, 3, 8.3);
        Student student2 = new Student("Lando",'m', 24, 1, 10.0);
        Student student3 = new Student("Oscar",'f', 19, 2, 9.5);
        Student student4 = new Student("Alex",'m', 25, 8, 6.7);
        Student student5 = new Student("Kate",'f', 21, 5, 7.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.gender == 'm';

        StudentInfo studentInfo = new StudentInfo();


        //studentInfo.testStudents(students, p1.and(p2));
        //studentInfo.testStudents(students, p1.or(p2));
//        studentInfo.testStudents(students, p1.negate());
//        System.out.println("-----------------------------------");
        //studentInfo.testStudents(students, p2);
//        studentInfo.testStudents(students, new CheckOverGrade());
//        System.out.println("-----------------------------------");
//        studentInfo.testStudents(students, (Student s) -> {return s.age < 22;});
//        System.out.println("-----------------------------------");
//        studentInfo.testStudents(students,  s -> s.age < 22);

//        Collections.sort(students, (stud1, stud2) -> stud1.course - stud2.course);
//        System.out.println(students);

//        StudentChecks sc = (Student s) -> {return s.age < 22;};
//        studentInfo.testStudents(students, sc);

        Function<Student, Double> f = student -> student.avgGrade;
        double res = avgOfSmth(students, student -> student.avgGrade);
        double res2 = avgOfSmth(students, student -> (double)student.course);

        System.out.println("res = " + res);
        System.out.println("res2 = " + res2);

    }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student student:list){
            result += f.apply(student);
        }

        return result/list.size();
    }

}

//interface StudentChecks{
//    boolean check(Student student);
//}
//
//class CheckOverGrade implements StudentChecks{
//    @Override
//    public boolean check(Student student) {
//        return student.avgGrade > 8;
//    }
//}

