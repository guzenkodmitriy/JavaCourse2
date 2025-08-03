package com.guzenko.test.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }

        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);

    }
    public static void main(String[] args) {
        ArrayList<Car> oursCar = createThreeCars(() -> new Car("Skoda Kodiaq", "white metalic", 2.0));
        System.out.println(oursCar);

        changeCar(oursCar.get(0), (car) -> {
            car.color = "red";
            car.engine = 3.0;
            System.out.println(car);});


    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
