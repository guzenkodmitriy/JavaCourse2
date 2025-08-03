package com.guzenko.test.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);

        linkedHashSet.add(3);
        linkedHashSet.add(5);
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);
        linkedHashSet.remove(2);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(5));

    }
}
