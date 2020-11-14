
package com.Exercise15;

public enum ConversionType {

    METERS_TO_YARDS,
    YARDS_TO_METERS,
    CENTIMETERS_TO_INCHES,
    INCHES_TO_CENTIMETERS,
    KILOMETERS_TO_MILES,
    MILES_TO_KILOMETERS;

    double distance;


    public static void metersToYards(double distance) {
        double METERS_TO_YARDS = 1.0936;
        double yards;
        yards = distance * METERS_TO_YARDS;
        System.out.printf("%,.2f Meters is %,.2f Yards"+"\n", distance, yards);
    }
    public static void yardsToMeters(double distance) {
        double  YARDS_TO_METERS= 0.914;
        double meters;
        meters = distance * YARDS_TO_METERS;
        System.out.printf("%,.2f Yards is %,.2f Meters"+"\n", distance, meters);
    }
    public static void centimetersToInches(double distance) {
        double  CENTIMETERS_TO_INCHES = 0.3937;
        double inches;
        inches = distance * CENTIMETERS_TO_INCHES;
        System.out.printf("%,.2f Centimeters is %,.2f Inches"+"\n", distance, inches);
    }
    public static void inchesToCentimeters(double distance) {
        double  INCHES_TO_CENTIMETERS = 2.54;
        double centimeters;
        centimeters = distance * INCHES_TO_CENTIMETERS;
        System.out.printf("%,.2f Inches is %,.2f Centimeters"+"\n", distance, centimeters);
    }
    public static void kilometersToMiles(double distance) {
        double  KILOMETERS_TO_MILES = 0.621;
        double miles;
        miles = distance * KILOMETERS_TO_MILES;
        System.out.printf("%,.2f Kilometers is %,.2f Miles"+"\n", distance, miles);
    }
    public static void milesToKilometers(double distance) {
        double  MILES_TO_KILOMETERS = 1.609;
        double kilometers;
        kilometers = distance * MILES_TO_KILOMETERS;
        System.out.printf("%,.2f Miles is %,.2f Kilometers"+"\n", distance, kilometers);
    }


}
