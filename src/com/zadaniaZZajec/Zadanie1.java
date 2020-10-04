package com.zadaniaZZajec;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        // Zadanie 6 Pobieraj liczby naturalne od użytkownika dopóki użytkownik nie zastopuje programu wpisując 0.
        // Liczby wprowadzone jako 1sza i 2ga, 3cia i 4ta, 5ta i 6sta... itd dodaj do siebie
        // po czym na zakończenie programu wypisz maksymalną i minimalną uzyskaną sumę.
        // Jeśli użytkownik wpisze nieparzystą liczbę argumentów to argument ostatni nie bierz pod uwagę.

        Scanner scanner = new Scanner(System.in);
        int input;
        int pom =1;
        int licznik = 1;
        int sumMax = Integer.MIN_VALUE, sumMin = Integer.MAX_VALUE;
        System.out.println("Input Number: "+"\n"+"0 - Ending Program");
        do {
            System.out.println("Input Number: ");
            input = scanner.nextInt();
            if (licznik%2==1 ) {
                pom = input;
            }
            else {
                if (sumMax < pom + input) {
                    sumMax = pom + input;
                }
                if (sumMin > pom + input) {
                    sumMin = pom + input;
                }
            }
            licznik++;
        } while (input!=0);
        System.out.println(sumMin==Integer.MAX_VALUE ? "Podano za malo danych" : sumMin);
        System.out.println(sumMax==Integer.MIN_VALUE ? "Podano za malo danych" : sumMax);
    }
}
