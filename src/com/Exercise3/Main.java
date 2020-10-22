package com.Exercise3;

import java.util.Map;
import java.util.TreeMap;

public class Main {


    public static void main(String[] args) {

        Exercise3 exercise3 = new Exercise3();

        Map<String,Integer>zbior =new TreeMap<>();

        zbior.put("Jan",123);
        zbior.put("Krzys",432);
        zbior.put("Ania",341);
        zbior.put("Bsia",987);
        zbior.put("Zbyszek",532);

        System.out.println("number of name: "+zbior.size());

        exercise3.zbior(zbior);
    }

}
