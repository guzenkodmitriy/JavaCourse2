package com.guzenko.test.collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Daniel");
        v.add("John");
        v.add("Mary");
        v.add("Michael");
        v.add("Jonathan");
        v.add("Julie");
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.remove(2);
        System.out.println(v);
        System.out.println(v.get(0));

    }

}
