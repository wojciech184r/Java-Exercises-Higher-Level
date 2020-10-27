package com.Exercise11;

import java.util.Comparator;

public class priceComp implements Comparator<CarService> {

    @Override
    public int compare(CarService o1, CarService o2) {
        return o1.getPrice(o2.getPrice());
    }
}
