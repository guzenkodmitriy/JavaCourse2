package com.guzenko.test.nested_class.static_nested_class;

public class Car {
    String color;
    int doorsCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorsCount, Engine engine) {
        this.color = color;
        this.doorsCount = doorsCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObjects);
        Engine engine1 = new Engine(150);
        System.out.println(engine1.horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorsCount=" + doorsCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine{
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObjects++;
            System.out.println(a);
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "HorsePower=" + horsePower +
                    '}';
        }
    }

}

class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(200);
        System.out.println(e);

        Car car = new Car("white", 4, e);
        System.out.println(car);

    }
}
