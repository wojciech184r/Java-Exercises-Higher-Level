package com.zadaniaZZajec;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public class Zadanie2 {

    public static void main(String[] args) {
        int lekcja1 = 10;
        int lekcja8 = 18;
        SimpleDateFormat time = new SimpleDateFormat();
        System.out.println();
        System.out.println(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));

        int hour = 10;
        switch (hour) {
            case 10:
                System.out.println("matematyka");
                break;
            case 11:
                System.out.println("Polski");
                break;
            case 12:
                System.out.println("Plastyka");
                break;
            case 13:
                System.out.println("geografia");
                break;
            case 14:
                System.out.println("niemiecki");
                break;
            case 15:
                System.out.println("francuski");
                break;
        }


    }
}
