package com.guzenko.test.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {

        List<?> list = new ArrayList<String>();
        //list.add("asddfa");
        List<Double> list1 = new ArrayList<>();
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.14);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        showListInfo(list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(1.0);
        list3.add(2.0);
        list3.add(3.14);

        Test3 test3 = new Test3();
        System.out.println(test3.sum(list3));

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(20);
        list4.add(314);
        System.out.println(test3.sum(list4));

    }

    static void showListInfo(List<?> list){
        System.out.println(list);
    }

    public double sum(ArrayList<? extends Number> list){
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
