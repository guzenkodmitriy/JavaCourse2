package com.guzenko.test.gueue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Max");
        queue.offer("Jorge");
        queue.offer("Lando");
        queue.offer("Oscar");
        queue.offer("Alex");

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
}
