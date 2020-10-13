package com.Exercise10;

import java.util.List;

public class Car {

    String name;
    String type;
    int price;
    int ageOfManufactor;
    Enum EngyneType;
    List<Manufacturer> list;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAgeOfManufactor() {
        return ageOfManufactor;
    }

    public void setAgeOfManufactor(int ageOfManufactor) {
        this.ageOfManufactor = ageOfManufactor;
    }

    public Car(String name, String type, int price, int ageOfManufactor,Enum EngyneType) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.ageOfManufactor = ageOfManufactor;
        this.EngyneType=EngyneType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (ageOfManufactor != car.ageOfManufactor) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        return EngyneType != null ? EngyneType.equals(car.EngyneType) : car.EngyneType == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + ageOfManufactor;
        result = 31 * result + (EngyneType != null ? EngyneType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", ageOfManufactor=" + ageOfManufactor +
                ", EngyneType='" + EngyneType + '\'' +
                '}';
    }
}
