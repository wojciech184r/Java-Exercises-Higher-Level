package com.Exercise9;

public class Circle extends Point2D {

    double area;
    double cyrcle;
    double radius;
    double p=x+y;


    public Circle(Point2D center,Point2D point ) {
        super();
    }



    double getRadius(){
        p=Math.pow(p,2);
        radius=Math.sqrt(p);
        return radius;
    }
    double getPerimeter(){
        cyrcle=2*Math.PI*radius;
        return cyrcle;
    }
    double getArea(){
        area=radius*radius*Math.PI;
        return area;
    }

}
