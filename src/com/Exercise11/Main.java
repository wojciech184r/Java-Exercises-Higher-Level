package com.Exercise11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.Exercise11.Engine.*;

public class Main {
    public static void main(String[] args) {

        CarService carService = new CarService();

        CarService cs = new CarService("Audi", "S3", 1980, V6, 80000);
        CarService cs2 = new CarService("Merc", "C63", 1998, V8, 7000);
        CarService cs3 = new CarService("VW", "Golf", 2010, V10, 51000);
        CarService cs4 = new CarService("Vauxhall", "Corsa", 2015, V12, 45000);
        CarService cs5 = new CarService("Seat", "Leon", 2010, V8, 50000);
        CarService cs6 = new CarService("Scoda", "Fabia VRS", 2008, V10, 47000);
        CarService cs7 = new CarService("Range Rover", "TV5", 2006, V12, 70000);
        CarService cs8 = new CarService("Land Rover", "Defender", 1970, V6, 48000);
        CarService cs9 = new CarService("Jaguar" +","+ "BMW"+"," + "VW", "F-Type", 2019, V8, 96000);
        CarService cs10 = new CarService("Toyota", "Land Cruser", 2003, V10, 60000);
        CarService cs11 = new CarService("Lexus", "RC", 2020, V8, 101000);

        List<CarService>carList = new ArrayList<CarService>();


        carList.add(cs);
        carList.add(cs2);
        carList.add(cs3);
        carList.add(cs4);
        carList.add(cs5);
        carList.add(cs6);
        carList.add(cs7);
        carList.add(cs8);
        carList.add(cs9);
        carList.add(cs10);
        carList.add(cs11);

        System.out.println("-----------");
        carService.listOfCars(carList);

        System.out.println("------------");
        carService.remove(carList,cs);

        System.out.println("-------------");
        carService.listOfCars(carList);

        System.out.println("-----------------");
        carService.engineSizeV12(carList);

        System.out.println("----------------");
        carService.productionAgeReturned(carList);

        System.out.println("------------------");
        carService.higherPrice(carList);

        System.out.println("--------------");
        carService.lowerPrice(carList);

        System.out.println("-------------------");
        carService.producentNameMade(cs);

        System.out.println("-------------------");
        carService.isCarOnList(carList);

        System.out.println("-------------------");
        carService.reverceList(carList);

        System.out.println("-------------------");
        carService.sortList(carList);

        System.out.println("-------------------");
        carService.producentName(carList);

        System.out.println("-------------------");












    }
}
