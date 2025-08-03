package com.guzenko.test.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};
        //array = Arrays.stream(array).sorted().toArray();

        int result = Arrays.stream(array)
                .filter(x -> x % 2 == 1)
                .map(x -> {
                    if (x % 3 == 0)
                    {
                        x = x / 3;
                    }
                    return x;
                })
                .reduce((a , b) -> a + b)
                .getAsInt();
        System.out.println(result);
    }
}
