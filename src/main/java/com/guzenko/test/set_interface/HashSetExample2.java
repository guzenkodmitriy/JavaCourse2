package com.guzenko.test.set_interface;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<Integer>();
        hashSet1.add(9);
        hashSet1.add(5);
        hashSet1.add(6);
        hashSet1.add(7);
        hashSet1.add(1);
        System.out.println(hashSet1);

        HashSet<Integer> hashSet2 = new HashSet<Integer>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(8);
        System.out.println(hashSet2);

        hashSet1.removeAll(hashSet2);

        System.out.println(hashSet1);
    }
}
