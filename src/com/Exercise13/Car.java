/*
Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA, itp.
 Każdy z pojazdów ma własne parametry np. cena, moc, itp. Enum powinien zawierać metody boolean isPremium()
  oraz boolean isRegular(). Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
Dodatkowo w ramach klasy enum powinna być zadeklarowana i zaimplementowana metoda boolean isFasterThan().
 Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym,
 że wskazany pojazd jest szybszy bądź nie od pojazdu przekazanego w argumencie. W tym celu skorzystaj z metody compareTo().
 */
package com.Exercise13;

public enum Car  {
    FERRARI(200000,620),
    PORSCHE(180000,580),
    MERCEDES(220000,660),
    BMW(150000,600),
    OPEL(60000,200),
    FIAT(30000,130),
    TOYOTA(100000,200);

    int price;
    int power;


     Car(int price, int power) {
        this.price = price;
        this.power = power;
    }

    public static boolean isPremium(Car car) {
        if (car.price>100000);
        System.out.println("Car : " +car+ " is premium because is more expencive than £100000");
        return true ;
    }

    public static boolean isRegular(Car car) {
         if (car.price<100000){
             System.out.println("Car : " +car+" Is Regular because "+ " is cheeper than  £100000");
         }else
             System.out.println("Car : " +car+" Is Premium because "+ " is more expencive than  £100000");
        return false;
    }

    public static boolean isFasterThan(Car car) {
         if (Car.FIAT.power<car.power){
             System.out.println("Car : " +car+ " is faster thrn "+ FIAT);
         }else
             System.out.println("Car : " +car+ " is slower thrn "+ FIAT);

        return false;
    }

    Car() {
    }
}
