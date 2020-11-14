package com.Exercise18;

public class Cone extends Shape3D implements Fillable {

    int r; // radius;
    int H; // hight;
    int L; // creating;


    @Override
    double calculatePerimeter() {
        double perimeter = 1 / 3f * (Math.PI * r * r * H);
        System.out.println("Perimeter of Cone is " + perimeter);
        return perimeter;
    }

    @Override
    double calculateArea() {
        double area = (Math.PI * Math.pow(r, 2)) + (Math.PI * r * L);
        System.out.println("Area of Cone is " + area);
        return area;
    }

    @Override
    public double calculateVolume() {
        double volume = calculatePerimeter() + calculateArea();
        System.out.println("Volume of Cone is " + volume);
        return volume;
    }


    public Cone(int r, int h) {
        this.r = r;
        H = h;
    }

    public Cone(int r, int h, int l) {
        this.r = r;
        H = h;
        L = l;
    }

    public static void fill(double z, Cone cone) {
        if (z == cone.calculateArea())
            System.out.println("Cone is full");
        else if (z > cone.calculateArea())
            System.out.println("Cone is overfill");
        else
            System.out.println("Cone is not full");
        System.out.println("Your declarate Volume is :" + z);
    }

}
