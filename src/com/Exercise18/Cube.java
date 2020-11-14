package com.Exercise18;

public class Cube extends Shape3D implements Fillable {

    int l;

    @Override
    public double calculateVolume() {
        double volume = l * l * l;
        System.out.println("Volume of Cube is : " + volume);
        return volume;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = Math.pow(l, 3);
        System.out.println("Perimeter of Cube is : " + perimeter);
        return perimeter;
    }

    @Override
    double calculateArea() {
        double area = 6 * Math.pow(l, 2);
        System.out.println("Area of Cube is : " + area);
        return area;
    }

    public Cube(int l) {
        this.l = l;
    }

    public static void fill(double z, Cube cube) {

        if (z == cube.calculateVolume())
            System.out.println("Cube is full");
        else if (z > cube.calculateVolume())
            System.out.println("Cube is overfill");
        else
            System.out.println("Cube is not full");
        System.out.println("Your declarate Volume is :" + z);

    }

}
