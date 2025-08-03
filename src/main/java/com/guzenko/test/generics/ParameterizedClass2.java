package com.guzenko.test.generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("a", 1);
        System.out.println(pair);

        Pair<Integer, Double> pair2 = new Pair<>(1, 3.14);
        System.out.println(pair2);

        OtherPair<String> otherPair = new OtherPair<>("Hello", ", World");
        System.out.println(otherPair);
    }
}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public void setValue1(V1 value1) {
        this.value1 = value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;
    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }
    public void setValue1(V value1) {
        this.value1 = value1;
    }
    public V getValue2() {
        return value2;
    }
    public void setValue2(V value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "OtherPair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
