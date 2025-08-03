package com.guzenko.test.nested_class.anonymous_class;

public class AnonymousClass {

    private int x = 5;

    public static void main(String[] args) {
        Math m = new Math() {

            @Override
            public int doOperation(int a, int b) {
                AnonymousClass anonymousClass = new AnonymousClass();

                return a + b + anonymousClass.x;
            }
        };
        System.out.println(m.doOperation(3, 4));

        Math m2 = new Math() {

            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(3, 4));
    }

}

interface Math{
    int doOperation(int a, int b);
}
