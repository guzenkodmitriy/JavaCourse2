package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("John");
        list1.add("Jane");
        list1.add("Joe");
        list1.add("David");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>(200);
        List<String> list3 = new ArrayList<>(200);

        ArrayList<String> list4 = new ArrayList<>(list1);

        System.out.println(list4);
        System.out.println(list4 == list1);
    }
}
