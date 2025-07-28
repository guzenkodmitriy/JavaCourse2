package com.guzenko.test.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
//       list.add(1);
//       list.add("Hello");
//       list.add(new StringBuilder("World"));

        list.add("Hello");
        list.add("World");

        for (String o : list) {
            System.out.println(o + " length " + o.length());
        }

    }
}
