package com.Exercise18;

public class Triangle extends Shape {
    double a = 0.0;
    double b = 0.0;
    double c = 0.0;
    double h = 0.0;

    @Override
    double calculatePerimeter() {
        double sum = a + b + c;
        System.out.println("Triangle Parimeter equals :" + sum);
        return sum;
    }

    @Override
    double calculateArea() {
        double area = (b * h) / 2;
        System.out.println("Triangle Area equals :" + area);
        return area;
    }

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

}
