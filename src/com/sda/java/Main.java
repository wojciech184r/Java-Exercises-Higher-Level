package com.sda.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("John");
        list.add("Bev");
        list.add("Ron");
        list.add("Martin");
        list.add("Jojo");
        list.add("Kiki");
        list.add("Lisa");
        list.add("Sam");
        list.add("Wojtek");



        Exercise1 exercise1 = new Exercise1();
        exercise1.sorting(list);
        System.out.println(list);
    }
}
