package com.Exercise16;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel core i5", 4, "Nevidia", "Dell", "Laptop");
        Computer computer2 = new Computer("Intel core i7", 8, "GeForce", "Apple", "Laptop");
        Computer computer3 = new Computer("AMD", 16, "Nevidia", "Acer", "Laptop");
        Computer computer4 = new Computer("Intel core i9", 128, "GeForce", "Lenovo", "Laptop");

        System.out.println(computer.getGraphicsCard());
        System.out.println(computer.hashCode());
        System.out.println(computer.equals(computer2));
        System.out.println(computer.procesor+",");
        System.out.println(computer.toString());



    }
}
