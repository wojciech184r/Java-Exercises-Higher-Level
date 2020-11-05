package com.Exercise17;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Intel i5",16,"GeForce","Dell","Laptop","2200 mAh");
        Laptop laptop2 = new Laptop("AMD Ryzen Pro",8,"Nevidia","Apple","Stationary","2600 mAh");
        Laptop laptop3 = new Laptop("Intel i7",4,"Nevidia","Lenovo","Stationary","2250 mAh");
        Laptop laptop4 = new Laptop("AMD",8,"GeForce","Sony","Laptop","2500 mAh");
        Laptop laptop5 = new Laptop("Intel i9",16,"GeForce","Thosiba","Laptop","2200 mAh");

        System.out.println(laptop.toString());
        System.out.println(laptop.getGraphicsCard());
        System.out.println(laptop3.getGraphicsCard());
        System.out.println(laptop4.getProcesor());

    }
}
