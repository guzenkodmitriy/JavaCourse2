package com.guzenko.test.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        Student student1 = new Student("David", "Davidson", 3);
        Student student2 = new Student("John", "Johnson", 4);
        Student student3 = new Student("Kate", "Stewart", 1);
        Student student4 = new Student("Mike", "Mikelson", 2);

        linkedHashMap.put(5.5, student4);
        linkedHashMap.put(8.5, student3);
        linkedHashMap.put(9.5, student2);
        linkedHashMap.put(7.5, student1);
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(8.5));
        System.out.println(linkedHashMap.get(9.5));

        System.out.println(linkedHashMap);
    }


}
