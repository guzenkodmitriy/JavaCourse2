package com.guzenko.test.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

        //double sumResult = list.stream().reduce((a, b) -> a + b).get();
        //double sumResult = list.parallelStream().reduce((a, b) -> a + b).get();
        //System.out.println(sumResult);

        double divisionResult = list.stream().reduce((a, b) -> a / b).get(); // 8
        double divisionResult2 = list.parallelStream().reduce((a, b) -> a / b).get(); // 0.5
        System.out.println(divisionResult);
        System.out.println(divisionResult2);
    }
}
