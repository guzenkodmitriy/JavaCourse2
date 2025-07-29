package com.guzenko.test.collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("John");
        arrayList1.add("David");
        arrayList1.add("Mike");
        arrayList1.add(1,"Julian");
        System.out.println(arrayList1);
//        for(String s: arrayList1){
//            System.out.println(s);
//        }

        for(int i=0; i<arrayList1.size(); i++){}

        arrayList1.set(2, "Koba");
        arrayList1.remove(2);

        System.out.println(arrayList1);

    }
}
