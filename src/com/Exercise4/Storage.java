//Stwórz klasę Storage, która będzie miała prywatne pole typu Map,
// publiczny konstruktor oraz metody:
// addToStorage(String key, String value) → dodawanie elementów do przechowywalni
// printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
// findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

package com.Exercise4;

import java.util.*;

public class Storage {


    private Map<String, String> name;//Stwórz klasę Storage, która będzie miała prywatne pole typu Map

    public Storage() {// publiczny konstruktor
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name=" + name +
                '}';
    }

    // addToStorage(String key, String value) → dodawanie elementów do przechowywalni:
    public void addToStorage(String key, String value) {
        Map<String, String> name = new TreeMap<String, String>();
        name.put(key, value);
        System.out.println(name);
    }


    // printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
    public void printValue(String key) {
        Set set = name.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }

    }

    // findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
    public String findValue(String value) {
        for (String item : name.values()) {
            if (name.keySet().isEmpty()) {
                System.out.println("Key " + item + " is Empty");
            } else
                System.out.println("Key " + item );
        }
        return value;
    }

    public static void main(String[] args) {

        Storage storage = new Storage();


        storage.addToStorage("Jan", "Caly");
        storage.addToStorage("Adam", "Maly");
        storage.addToStorage("Stas", "Smialy");
        storage.addToStorage("Zbyszek", "Kowalski");
        storage.addToStorage("Marek", "");

        System.out.println("---------------------------");





    }


}
