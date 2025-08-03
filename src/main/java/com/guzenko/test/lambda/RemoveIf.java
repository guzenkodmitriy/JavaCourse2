package com.guzenko.test.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("World");
        al.add("Learn Java");
        al.add("OK");
        al.add("A imenno lambdas");
        al.removeIf(s -> s.length() < 6);


//        Predicate<String>  predicate = s -> s.length() < 6;
//        al.removeIf(predicate);
        System.out.println(al.toString());
    }
}
