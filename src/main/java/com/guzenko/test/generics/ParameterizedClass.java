package com.guzenko.test.generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        
        Info<Integer> i = new Info<>(11);
        System.out.println(i);
    }

}

class Info<T extends Number> {
    private T value;

    public Info(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
}
