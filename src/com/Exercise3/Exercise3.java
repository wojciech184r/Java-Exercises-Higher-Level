//Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string,
// a wartością liczba, a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: <k>, Wartość: <v>.
// Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.

package com.Exercise3;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Exercise3 {

    public void zbior(Map<String,Integer>name) {
        Iterator iterator = name.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next(); // przesuwa iterator
            //jeżeli jest następny element to endingString = ,
            //jeżeli nie ma następnego elementu to endingString = .
            String endingString = iterator.hasNext() ? "," : ".";
            System.out.println("Key " + entry.getKey() + " : " + " Value " + entry.getValue() +endingString);
        }
    }
}
