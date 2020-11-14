package com.Exercise18;

public class Hexagon extends Shape {
    double a;

    @Override
    double calculatePerimeter() {
        double sum1 = (6 * a);
        System.out.println("Hexagon Perimeter equals: " + sum1);
        return sum1;
    }

    @Override
    double calculateArea() {
        double sum2 = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2.0;
        System.out.println("Hexagon Area equals: " + sum2);
        return sum2;
    }

    public Hexagon(double a) {
        this.a = a;
    }
}
