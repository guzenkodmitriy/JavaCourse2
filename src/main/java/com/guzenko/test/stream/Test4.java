package com.guzenko.test.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((a, b) -> a * b).get();
        //System.out.println(result);

        int result2 = list.stream().reduce(1,(a, b) -> a * b);
        System.out.println(result2);

//        Optional<Integer> result = list.stream().reduce((accumulator, element) ->
//                accumulator * element);
//
//        if (result.isPresent()) {
//            System.out.println(result.get());
//        }

        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("World");
        list3.add("How are you?");
        list3.add("I'm fine");
        list3.add("Bye");

        String result3 = list3.stream().reduce((a, b) -> a + " " + b).get();
        System.out.println(result3);

    }
}
