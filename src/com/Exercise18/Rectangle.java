

package com.Exercise18;

public class Rectangle extends Shape {
    double b = 0;
    double c = 0;

    @Override
    double calculatePerimeter() {
        double sum1 = (2*b) + (2*c);
        System.out.println("Rectangle Perimeter equals: "+sum1);
        return sum1;
    }

    @Override
    double calculateArea() {
        double sum = b * c;
        System.out.println("Rectangle Area equals: " + sum);
        return sum;
    }

    public Rectangle(double b, double c) {
        this.b = b;
        this.c = c;
    }
}
