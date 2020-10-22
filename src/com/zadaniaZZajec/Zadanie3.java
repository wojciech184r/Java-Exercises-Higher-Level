package com.zadaniaZZajec;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        float b = scanner.nextFloat();
        System.out.println("Podaj jeden ze znaków '+ - / *' ");
        String input = scanner.next();
        char znak = input.charAt(0);
        System.out.println("Podaj drugą liczbę");
        float d = scanner.nextFloat();
        switch (znak) {
            case '+':
                System.out.println(b+d);
                break;
            case '-':
                System.out.println(b-d);
                break;
            case '/':
                if (d != 0) {
                    System.out.println(b / d);
                } else {
                    System.out.println("Błąd");
                }
                break;
            case '*':
                System.out.println(b*d);
                break;
            default:
                System.out.println("Błędny znak");
        }
    }
}
