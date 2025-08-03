package com.guzenko.test.nested_class.inner_class;

public class Car {
    String color;
    int doorsCount;
    Engine engine;

    public Car(String color, int doorsCount) {
        this.color = color;
        this.doorsCount = doorsCount;
        //this.engine = this.new Engine(horsePower);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorsCount=" + doorsCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine{
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
        Car car = new Car("white", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(car);

        Car.Engine engine2 = new Car("black", 4).new Engine(150);

    }
}
