package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("John");
        arrayList1.add("David");
        arrayList1.add("Mike");
        arrayList1.add("Julian");
        arrayList1.add("Koba");

        List<Integer> list1 = List.of(3, 8 , 13);
        System.out.println(list1);
        //list1.add(100);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
//        list2.add("David");
//        System.out.println(arrayList1);
//
//        Object[] arrayList2 = arrayList1.toArray();
//        String[] arrayList3 = arrayList1.toArray(new String[0]);
//        for (String s : arrayList3) {
//            System.out.println(s);
//        }

//        List<String> myList = arrayList1.subList(1,4);
//        System.out.println(myList);
//        myList.add("David2");
//        System.out.println(myList);
//        System.out.println(arrayList1);
//        arrayList1.add("Sveta");
//        System.out.println(arrayList1);
//        //System.out.println(myList);
//
//
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("John");
//        //arrayList2.add("Koba");
//        arrayList2.add("Julian");
//        arrayList2.add("Mike");
//        arrayList2.add("David");

        //arrayList1.removeAll(arrayList2);
//        arrayList1.retainAll(arrayList2);
//        System.out.println(arrayList1);

//        boolean b = arrayList1.containsAll(arrayList2);
//        System.out.println(b);

    }

}
