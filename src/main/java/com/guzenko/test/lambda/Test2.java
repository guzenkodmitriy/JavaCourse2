package com.guzenko.test.lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc());
    }

    public static void main(String[] args) {
        def(() -> 5);
    }
}

interface I {
    int abc();
}
