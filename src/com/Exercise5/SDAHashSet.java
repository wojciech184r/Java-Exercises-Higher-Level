//Zaimplementuj klasę SDAHashSet<E> , która będzie implementować logikę HashSet<E>. W tym celu
//zaimplementuj obsługę metod:
//• add
//• remove • size
//• contains • clear

package com.Exercise5;

import java.util.HashSet;
import java.util.Set;

public class SDAHashSet<E> {
    public static void main(String[] args) {

        Set<String> name = new HashSet<>();
        name.add("Kasia");
        name.add("Basia");
        name.add("Asia");
        name.add("Zosia");
        name.add("Krysia");
        name.add("Stasia");
        name.add("Gabrysia");

        System.out.println(name);
        System.out.println("Set is empty "+name.isEmpty());
        System.out.println("Set size "+name.size());
        System.out.println("Name contains "+name+name.contains("Asia"));
        System.out.println("Set remove name "+name.remove("Stasia"));
        System.out.println("Set size "+name.size());
        name.clear();
        System.out.println("Set is empty "+name.isEmpty());
    }
}
