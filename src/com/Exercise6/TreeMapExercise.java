//Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.

package com.Exercise6;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExercise {
    public static void main(String[] args) {

        TreeMapExercise tree = new TreeMapExercise();

        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        /*Adding elements to TreeMap*/
        tmap.put(1, "Data1");
        tmap.put(23, "Data2");
        tmap.put(70, "Data3");
        tmap.put(4, "Data4");
        tmap.put(2, "Data5");

        /* Display content using Iterator*/
        Set set = tmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }
        tree.firstandLastPosition(tmap);
    }


    public void  firstandLastPosition(TreeMap<Integer, String> name) {

        System.out.println(name.firstEntry());
        System.out.println(name.lastEntry());
    }
}
