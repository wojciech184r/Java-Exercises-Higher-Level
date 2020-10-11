//Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor.
// Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
//Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych punktów,
// klasa Circle ma określać:
//• promień okręgu przy wywołaniu metody double getRadius()
//• obwód okręgu przy wywołaniu metody double getPerimeter()
//• pole okręgu przy wywołaniu metody double getArea()
//• *(trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody
// List<Point2D> getSlicePoints()



package com.Exercise9;

public class Point2D {

    double x;
    double y;

    public Point2D() {
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }



}
