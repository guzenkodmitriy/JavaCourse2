package com.guzenko.test.gueue_interface;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> a = new ArrayDeque<>();
        a.addFirst(3);
        a.addFirst(5);
        a.addLast(7);
        a.offerFirst(1);
        a.offerLast(2);
        System.out.println(a);
        System.out.println(a.getFirst());
        System.out.println(a.getLast());
        System.out.println(a.removeFirst());
        System.out.println(a);
        System.out.println(a.peekFirst());
        System.out.println(a.peekLast());
        System.out.println(a);



    }
}
