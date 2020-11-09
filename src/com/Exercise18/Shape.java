/*
Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter() służącą do
   obliczania obwodu oraz calculateArea() służącą do obliczania powierzchni.
     Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape,
      odpowiednio implementując metody abstrakcyjne. Sprawdź poprawność działania.
 */
package com.Exercise18;

 abstract class Shape {
     public static void main(String[] args) {
         Triangle triangle = new Triangle(3.0,4.0);
         Triangle triangle2 = new Triangle(3.0,3.0,5.0);
         triangle.calculateArea();
         triangle2.calculatePerimeter();
         System.out.println("------------------");
         Rectangle rectangle = new Rectangle(4.0,5.0);
         rectangle.calculateArea();
         rectangle.calculatePerimeter();
         System.out.println("------------------");
         Hexagon hexagon = new Hexagon(6.0);
         hexagon.calculateArea();
         hexagon.calculatePerimeter();
     }

     abstract double calculatePerimeter();
     abstract double calculateArea();

 }
