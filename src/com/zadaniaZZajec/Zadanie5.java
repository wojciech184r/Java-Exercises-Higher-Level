package com.zadaniaZZajec;

import java.util.Arrays;

// SITO REASTOTELESA

public class Zadanie5 {

    public static void main(String[] args) {
        int z = 100;// dlugosc tablicy
        boolean liczbyPierwsze[] = new boolean[z+1];
        Arrays.fill(liczbyPierwsze,true);
        liczbyPierwsze[0] = false;
        liczbyPierwsze[1] = false;

        for (int i = 2; i<z;i++){
            for (int j = i+i; j < z; j=j+i) { // szukamy wielokrotności np. 2+2=4; 2+2+2=6;...
                liczbyPierwsze[j]=false;
            }
        }
        for (int i = 0; i<liczbyPierwsze.length;i++){
            if (liczbyPierwsze[i]==true){
                System.out.println("liczby pierwsze to: "+ i);
            }
        }

    }

}
