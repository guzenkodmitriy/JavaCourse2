package com.guzenko.test.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("John");
        arrayList1.add("David");
        arrayList1.add("Mike");
        arrayList1.add("Julian");
        arrayList1.add("Koba");

        Iterator<String> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
            //System.out.println(iterator1.next());
        }
        System.out.println(arrayList1);
    }
}
