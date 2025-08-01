package com.guzenko.test.set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(8);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(2);

        treeSet.remove(2);

        System.out.println(treeSet);
        System.out.println(treeSet.contains(2));
    }
}
