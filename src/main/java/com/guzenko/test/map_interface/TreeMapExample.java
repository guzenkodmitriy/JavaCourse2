package com.guzenko.test.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student student1 = new Student("David", "Davidson", 3);
        Student student2 = new Student("John", "Johnson", 4);
        Student student3 = new Student("Kate", "Stewart", 1);
        Student student4 = new Student("Mike", "Mikelson", 2);
        Student student5 = new Student("Kevin", "Magnusen", 5);
        Student student6 = new Student("Maks", "Ferstappen", 1);
        Student student7 = new Student("Lando", "Norris", 4);
        Student student8 = new Student("Maks", "Ferstappen", 1);

        treeMap.put(5.5, student4);
        treeMap.put(8.5, student3);
        treeMap.put(9.5, student7);
        treeMap.put(7.5, student1);
        treeMap.put(6.5, student5);
        treeMap.put(7.9, student2);
        treeMap.put(6.9, student6);

//        treeMap.put(student4, 5.5);
//        treeMap.put(student3, 8.5);
//        treeMap.put(student7, 9.5);
//        treeMap.put(student1, 7.5);
//        treeMap.put(student5, 6.5);
//        treeMap.put(student2, 7.9);
//        treeMap.put(student6, 6.9);
        System.out.println(treeMap);
        System.out.println(treeMap.containsKey(student8));


//        System.out.println(treeMap);
//        System.out.println(treeMap.get(7.9));
//        treeMap.remove(6.9);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.5));
//        System.out.println(treeMap.headMap(7.5));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());

    }
}
