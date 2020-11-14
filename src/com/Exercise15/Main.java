package com.Exercise15;

public class Main {
    public static void main(String[] args) {

        MeasurementConverter.convert(3,ConversionType.METERS_TO_YARDS);
        MeasurementConverter.convert(2,ConversionType.YARDS_TO_METERS);
        MeasurementConverter.convert(1,ConversionType.INCHES_TO_CENTIMETERS);
        MeasurementConverter.convert(5,ConversionType.CENTIMETERS_TO_INCHES);
        MeasurementConverter.convert(6,ConversionType.KILOMETERS_TO_MILES);
        MeasurementConverter.convert(3,ConversionType.MILES_TO_KILOMETERS);
    }
}
