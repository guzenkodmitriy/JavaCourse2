package com.guzenko.test.generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("John", 13);
        Schoolar schoolar2 = new Schoolar("Jane", 12);
        Schoolar schoolar3 = new Schoolar("Jack", 14);
        Schoolar schoolar4 = new Schoolar("Koba", 12);

        Student student1 = new Student("Kate", 18);
        Student student2 = new Student("Mike", 23);

        Employee employee1 = new Employee("David", 37);
        Employee employee2 = new Employee("Jack", 45);

        Team<Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addParticipant(schoolar1);
        schoolarTeam.addParticipant(schoolar2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Minuscule");
        schoolarTeam2.addParticipant(schoolar3);
        schoolarTeam2.addParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Go");
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Workers");
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

        schoolarTeam.playWith(schoolarTeam2);

    }
}
