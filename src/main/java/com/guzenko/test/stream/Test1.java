package com.guzenko.test.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("How are you?");
        list.add("I'm fine");
        list.add("OK");

//        for(int i = 0; i < list.size(); i++){
//            list.set( i , String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println("res = " + list);
        System.out.println("res2 = " + list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element ->
        {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println("res = " + Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("World");
        set.add("How are you?");
        set.add("I'm fine");
        set.add("OK");

        System.out.println("res = " + set);

        Set<Integer> set2 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println("res2 = " + set2);
        System.out.println("res3 = " + list3);


    }
}
