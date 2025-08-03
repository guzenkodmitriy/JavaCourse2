package com.guzenko.test.comparation;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee employee1 = new Employee(100, "John", "Ivanov", 100);
        Employee employee2 = new Employee(15, "Mike", "Doe", 500);
        Employee employee3 = new Employee(123, "Mike", "Johnson", 300);

        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        System.out.println("before sort");
        System.out.println(list);
        //Collections.sort(list, new IdComparator() {});
        Collections.sort(list, new SalaryComparator(){});
        System.out.println("after sort");
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    Integer id;
    String name;
    String surname;
    int salary;
    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        if (this.id == employee.id) {
            return 0;
        }
        else  if (this.id < employee.id) {
            return -1;
        }
        else {
            return 1;
        }

        //return this.id - employee.id;
        //return this.id.compareTo(employee.id);

//        int result = this.name.compareTo(employee.name);
//        if (result == 0){
//            result = this.surname.compareTo(employee.surname);
//        }

    }
}

//class IdComparator implements Comparator<Employee> {
//    @Override
//    public int compare(Employee employee1, Employee employee2) {
//        if (employee1.id == employee2.id) {
//            return 0;
//        }
//        else  if (employee1.id < employee2.id) {
//            return -1;
//        }
//        else {
//            return 1;
//        }
//    }
//}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        int result = employee1.name.compareTo(employee2.name);
        if (result == 0){
            result = employee1.surname.compareTo(employee2.surname);
        }

        return result;
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.salary - employee2.salary;
    }
}