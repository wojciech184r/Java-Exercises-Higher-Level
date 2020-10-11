//Stwórz klasę imitującą magazynek do broni.
// Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą konstruktora. Zaimplementuj metody:

//loadBullet(String bullet) → dodawanie naboju do magazynka,
// nie pozwala załadować więcej naboi niż wynosi pojemność magazynka

//isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie

//shot() → jedno wywołanie wystrzeliwuje
// (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój i przygotowuje kolejny,
// załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli “pusty magazynek”


package com.Exercise7;

import java.util.HashSet;

public class BuletStorage {


    HashSet<String> storageSize = new HashSet<>();
    private int size;
    String bullet;


    void loadBullet(String bullet) {
        if (storageSize.size() <= size) {
            storageSize.add(bullet);
            System.out.println("bullet is loaded");
        }
        if (storageSize.size()>size){
            System.out.println("Storage is full U cannot put more");
        }
    }

    int isLoaded() {
        if (0 < storageSize.size())
            System.out.println("Is Loaded");
        return storageSize.size();
    }

    void shot() {
        System.out.println("Puff");
        if (storageSize.remove(bullet)){
            System.out.println(storageSize.size());
        }
        if (storageSize.isEmpty()){
            System.out.println("Bullet Storage is empty");
        }

    }

    public BuletStorage(int size) {
        this.storageSize = storageSize;
    }

}




