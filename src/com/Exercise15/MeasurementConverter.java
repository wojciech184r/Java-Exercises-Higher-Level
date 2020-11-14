package com.Exercise15;

public class MeasurementConverter{

    public static void convert(double value,ConversionType c){
        if (c.equals(ConversionType.METERS_TO_YARDS)){
            ConversionType.metersToYards(value);
        }
        else if (c.equals(ConversionType.YARDS_TO_METERS)){
            ConversionType.yardsToMeters(value);
        }
        else if (c.equals(ConversionType.INCHES_TO_CENTIMETERS)){
            ConversionType.centimetersToInches(value);
        }
        else if (c.equals(ConversionType.CENTIMETERS_TO_INCHES)){
            ConversionType.inchesToCentimeters(value);
        }
        else if (c.equals(ConversionType.KILOMETERS_TO_MILES)){
            ConversionType.kilometersToMiles(value);
        }
        else if (c.equals(ConversionType.MILES_TO_KILOMETERS)){
            ConversionType.milesToKilometers(value);
        }
    }
}
