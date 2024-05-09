package com.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> items = List.of(
                "Item 1",
                "Item 2",
                "Item 3"
        );

        var basketTotal = 0;

        for (String item : items) {
            basketTotal ++;
        }

        System.out.println("Basket total: " + basketTotal);


    }



}
