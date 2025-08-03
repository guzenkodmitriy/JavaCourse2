package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        StringBuilder st1 = new StringBuilder("A");
        StringBuilder st2 = new StringBuilder("B");
        StringBuilder st3 = new StringBuilder("C");
        StringBuilder st4 = new StringBuilder("D");

        StringBuilder[] arrayList1 = {st1, st2, st3, st4};
        List<StringBuilder> list = Arrays.asList(arrayList1);
        System.out.println(list);
        arrayList1[0].append("!!!");
        arrayList1[0] = new StringBuilder("F");
        System.out.println(list);
    }
}
