package com.guzenko.test.stream;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(
                x -> {x *= 2; System.out.println(x);}
        );
    }
}
