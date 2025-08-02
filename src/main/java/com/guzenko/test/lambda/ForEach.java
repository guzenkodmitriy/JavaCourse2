package com.guzenko.test.lambda;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Hello", "World", "How are you?", "I'm fine");
        list.forEach(s ->  System.out.println(s));
        System.out.println("-------------------------------------");
        list.forEach(System.out::println);
    }
}
