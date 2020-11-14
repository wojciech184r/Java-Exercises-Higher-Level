/*
Stwórz klasę CarService , która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
1. dodawanie aut do listy,
2. usuwanie auta z listy,
3. zwracanie listy wszystkich aut,
4. zwracanie aut z silnikiem V12,
5. zwracanie aut wyprodukowanych przed rokiem 1999,
6. zwracanie najdroższego auta,
7. zwracanie najtańszego auta,
8. zwracanie auta z co najmniej 3 producentami,
9. zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
10. sprawdzanie czy konkretne auto znajduje się na liście,
11. zwracanie listy aut wyprodukowanych przez konkretnego producenta,
12. zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
 */


package com.Exercise11;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.Exercise11.Engine.*;


public class CarService {
    String producentName;
    String carName;
    int productionAge;
    Enum engine;
    int price;


    List<CarService> carList = new ArrayList<>();

    public void add(CarService s) {
        carList.add(s);
    }

    public void remove(List<CarService> carList, CarService s) {
        carList.remove(s);
        System.out.println("Car removed fro list " + s);

    }

    public void listOfCars(List<CarService> carList) {
        if (carList.size() > 0)
            System.out.println("Car on list is  " + carList);
    }

    public void engineSizeV12(List<CarService> carList) {
        for (CarService Car : carList) {
            if (Car.getEngine() == V12)
                System.out.println("Car with V12 engine is: " + Car);
        }
    }

    public int productionAgeReturned(List<CarService> carList) {
        for (CarService Cars : carList)
            if (Cars.getProductionAge() < 1999) {
                System.out.println("Car been made before 1999 is " + Cars);
            }
        return productionAge;
    }

    List<Integer> list = new ArrayList<>();

    public void higherPrice(List<CarService> carList) {
        CarService maxPrice = Collections.max(carList, new priceComp());
        System.out.println("Price for most expensive car is:  " + maxPrice);
    }


    public void lowerPrice(List<CarService> carList) {
        CarService minPrice = Collections.min(carList, new priceComp());
        System.out.println("Price for cheepers car is: " + minPrice);
    }

    List<String> listName = new ArrayList<>();

    public void producentName(List<CarService> carList) {
        for (CarService proName : carList) {
            listName.add(proName.producentName);
            Pattern pattern = Pattern.compile("[,]");
            Matcher m = pattern.matcher(proName.getProducentName());
            if (m.find())
                System.out.println("Producent Name's are: " + proName.producentName + " and they made car:  " + proName.carName);

        }
    }

    public void sortList(List<CarService> carList) {
        carList = new ArrayList<>();
        carList.sort((o1, o2) -> price);
        System.out.println(carList);
    }

    public void reverceList(List<CarService> carList) {
        Collections.reverse(carList);
        System.out.println(carList);
    }

    public void isCarOnList(List<CarService> carList) {
        carList.isEmpty();
        System.out.println(carList.toString());
    }

    public void producentNameMade(CarService carService) {
        System.out.println("Producent name of Your choice is: " + carService.getProducentName());

    }


    public CarService(String producentName, String carName, int productionAge, Enum engine, int price) {
        this.producentName = producentName;
        this.carName = carName;
        this.productionAge = productionAge;
        this.engine = engine;
        this.price = price;
    }

    public CarService() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getProducentName() {
        return producentName;
    }

    public void setProducentName(String producentName) {
        this.producentName = producentName;
    }

    public int getProductionAge() {
        return productionAge;
    }

    public void setProductionAge(int productionAge) {
        this.productionAge = productionAge;
    }

    public Enum getEngine() {
        return engine;
    }

    public void setEngine(Enum engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarService{" +
                "producentName='" + producentName + '\'' +
                ", carName='" + carName + '\'' +
                ", productionAge=" + productionAge +
                ", engine=" + engine +
                ", price=" + price +
                '}' + '\n';
    }

    public int getPrice(Object price) {
        for (CarService c : carList) {
            int v = c.getPrice();
            c.getPrice();
        }
        return getPrice();
    }


}
