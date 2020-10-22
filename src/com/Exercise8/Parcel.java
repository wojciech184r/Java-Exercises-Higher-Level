package com.Exercise8;

public class Parcel {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;


    public Parcel(int xLength, int yLength, int zLength) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
    }

    boolean isExpress(float weight) {
        if (weight > 30) {
            System.out.println("Parcel cannot be Express to hevy " + weight);
        } else if (weight <= 15) {
            System.out.println("Parcel is Express");
        }
        return false;
    }

   void mesure(Parcel parcel) {
        if (this.xLength + this.yLength + this.zLength > 300) {
            System.out.println("Parcel is to big");
        }else
            System.out.println("Parcel mesure equals "+(this.xLength+this.yLength+this.zLength));
    }
    void rightParameter(Parcel parcel){
        if (this.xLength<30 || this.yLength<30 || this.zLength<30){
            System.out.println("Parameters cannot be smaller then 30");
        }else
            System.out.println("Parameters correct");
    }

}

