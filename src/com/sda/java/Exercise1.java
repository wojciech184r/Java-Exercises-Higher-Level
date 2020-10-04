//Stwórz metodę, która jako parametr przyjmuje listę stringów,
// następnie zwraca tą listę posortowaną alfabetycznie od Z do A.

package com.sda.java;
import java.util.Collections;
import java.util.List;


public class Exercise1 {
    public List<String> sorting(List<String>list){
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }
}
