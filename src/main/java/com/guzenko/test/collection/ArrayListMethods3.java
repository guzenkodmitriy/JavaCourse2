package com.guzenko.test.collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("John");
        arrayList1.add("David");
        arrayList1.add("Mike");
        arrayList1.add(1,"Julian");
        arrayList1.add("David");
        System.out.println(arrayList1);

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//
//        //arrayList1.addAll(1, arrayList2);
//        //arrayList1.clear();
//
//        //arrayList1.indexOf()
//        System.out.println(arrayList1);
//        System.out.println(arrayList1.indexOf("David"));

        System.out.println(arrayList1.contains("David"));

    }
}
