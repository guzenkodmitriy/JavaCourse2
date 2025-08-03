package com.guzenko.test.collection;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("David");
        stack.push("Peter");
        stack.push("Mary");
        stack.push("John");
        System.out.println(stack);
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
