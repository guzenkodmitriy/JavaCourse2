package com.guzenko.test.map_interface;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashTable = new Hashtable<>();
        Student student1 = new Student("Mike", "Mikelson", 2);
        Student student2 = new Student("Kevin", "Magnusen", 5);
        Student student3 = new Student("Maks", "Ferstappen", 1);
        Student student4 = new Student("Lando", "Norris", 4);

        hashTable.put(7.8, student1);
        hashTable.put(9.3, student2);
        hashTable.put(5.8, student3);
        hashTable.put(6.0, student4);

        System.out.println(hashTable);
    }
}
