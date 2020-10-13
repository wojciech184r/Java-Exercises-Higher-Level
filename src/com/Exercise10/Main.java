package com.Exercise10;

import static com.Exercise10.EngyneType.V12;
import static com.Exercise10.EngyneType.V8;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("VW", "Golf", 20000, 2020, V12);
        Car car2 = new Car("Merc", "SLS", 200000, 2020, V8);
        Manufacturer manufacturer = new Manufacturer("Audi", 1945, "Germany");

        System.out.println(manufacturer);
        System.out.println(car);
        System.out.println(car2);

        System.out.println("Is Object 1 and Object 2 are the same = " + car.equals(car2));
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());


        System.out.println(car.equals(car2));
        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());


    }
}
