//Stwórz metodę, która jako parametr przyjmuje listę stringów,
// następnie zwraca tą listę posortowaną alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.


package com.sda.java;

import java.util.Collections;
import java.util.List;

public class Exercise2 {
    public List<String> sortIgnoreCase(List<String>list){
        Collections.sort(list,String::compareToIgnoreCase);
        return list;
    }

}
