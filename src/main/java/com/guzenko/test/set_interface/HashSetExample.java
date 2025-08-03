package com.guzenko.test.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Zaur");
        hashSet.add("Oleg");
        hashSet.add("Marina");
        hashSet.add("Igor");
        hashSet.add("Marina");

        hashSet.remove("Marina");

        for (String str : hashSet) {
            System.out.println(str);
        }
        System.out.println(hashSet.contains("Igor"));


    }

}
