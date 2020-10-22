package com.Exercise9;

public class Main {
    public static void main(String[] args) {


        Point2D point2D = new Circle(new Point2D(0, 4));


        Circle.p(point2D.x, point2D.y);
        double z=Circle.getRadius(point2D.x, point2D.y);
        Circle.getPerimeter(z);
        Circle.getArea(z);


    }
}
