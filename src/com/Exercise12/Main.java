package com.Exercise12;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[100000];
        Random rand = new Random();

        List<Integer> original = new ArrayList<>();
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < array.length; i++) {
            original.add(rand.nextInt(10000));

        }
        Collections.sort(original);
        System.out.println(original);
//        NumberWithOutDuplicates(original);
        System.out.println("-----------NEXT METHOD --------");
        System.out.println("-------MORE THEN ONCE----------");
//        NumberMorethen1(original);
        System.out.println("-----------NEXT METHOD --------");
        System.out.println("-------MORE THEN 25 TIMES----------");
//        NumberOcurredMoreThen25Times(original);
    }

    static void NumberWithOutDuplicates(List<Integer> list) {
        Set<Integer> setToReturn = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        for (Integer num : list) {
            if (!set1.add(num)) {
                setToReturn.add(num);
            }
        }
        list.removeAll(setToReturn);
        System.out.println("Numbers without duplicates " + "\n" + list);

    }

    static void NumberMorethen1(List<Integer> list) {
        Set<Integer> setToReturn = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        List<Integer> finalList = new ArrayList<>();

        for (Integer num : list) {
            if (!set1.add(num)) {
                setToReturn.add(num);
            }
        }
        System.out.println("Numbers with duplicates " + "\n" + setToReturn);

    }

//        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
//        for (Integer i : list) {
//            Integer listValue = map.get(i);
//            if (null == listValue) {
//                map.put(i, 1);
//            } else {
//                map.put(i, listValue + 1);
//            }
//            for (Integer key : map.keySet()) {
//                if (map.get(key) > 1){
//                    result.add(key);
//                    System.out.println("number: " + key + ",count: " + map.get(key));
//
//            }
//
//        }
//    }


    static void NumberOcurredMoreThen25Times(List<Integer> list) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (Integer i : list) {
            Integer j = hm.get(i);
            hm.put(i,(j == null) ? 1 : j+1);
        }
        for (Map.Entry<Integer,Integer> val : hm.entrySet()){
            if (val.getValue()==25)
            System.out.println("Element "+ val.getKey() + " occurs: " + val.getValue() + " times");
        }
    }
}

