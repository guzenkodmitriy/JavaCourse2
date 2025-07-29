package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(15);
        list.add(3);
        list.add(18);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(10);
        list.add(4);
        list.add(2);
        list.add(-30);
        list.add(-15);
        list.add(13);
        list.add(40);
        list.add(15);
        list.add(-1);
        list.add(17);
        list.add(18);
        list.add(-22);
        list.add(20);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
//
//        int index1 = Collections.binarySearch(list, -30);
//        System.out.println(index1);

//        Employee employee1 = new Employee(100, "David", 1358);
//        Employee employee2 = new Employee(15, "Kate", 500);
//        Employee employee3 = new Employee(123, "Koba", 705);
//        Employee employee4 = new Employee(15, "Gal", 1000);
//        Employee employee5 = new Employee(182, "John", 1200);
//        Employee employee6 = new Employee(15, "Jane", 950);
//        Employee employee7 = new Employee(250, "Mary", 9545);
//
//        List<Employee> list = new ArrayList<>();
//        list.add(employee1);
//        list.add(employee2);
//        list.add(employee3);
//        list.add(employee4);
//        list.add(employee5);
//        list.add(employee6);
//        list.add(employee7);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        int index2 = Collections.binarySearch(list, new Employee(182, "John", 1200));
//        System.out.println(index2);

//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int index3 = Arrays.binarySearch(array, 150);
//        System.out.println(index3);
    }
}

class Employee implements Comparable<Employee>{

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
