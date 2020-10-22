package com.Exercise9;

public class Circle extends Point2D {

    private static double p;
    private static double radius;
    private static double cyrcle;
    private static double area;


    public Circle(Point2D point) {
        super(point.x, point.y);
    }

    public Circle(Point2D centre, Point2D point2D) {

    }

    static double p(double x, double y) {
        System.out.println(x + y);
        return x + y;
    }


    static double getRadius(double x, double y) {
        p = x + y;
        double z = Math.pow(p, 2);
        radius = Math.sqrt(z);
        System.out.println(radius);
        return radius;
    }

    static double getPerimeter(double radius) {
        cyrcle = 2 * Math.PI * radius;
        System.out.println(cyrcle);
        return cyrcle;
    }

    static double getArea(double radius) {
        area = radius * radius * Math.PI;
        System.out.println(area);
        return area;
    }

}
