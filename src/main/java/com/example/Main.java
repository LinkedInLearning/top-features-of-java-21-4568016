package com.example;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        List<Item> items = List.of(
                new Item(new BigDecimal("10.00")),
                new Item(new BigDecimal("20.00")),
                new Item(new BigDecimal("30.00")),
                new Item(new BigDecimal("40.00")),
                new Item(new BigDecimal("50.00"))
        );

        var basketTotal = 0;

        for (Item _ : items) {
            basketTotal ++;
        }

        System.out.println("Basket total: " + basketTotal);


        Queue<Item> items2 = new ArrayDeque<>(List.of(
                new Item(new BigDecimal("10.00")),
                new Item(new BigDecimal("20.00")),
                new Item(new BigDecimal("30.00")),
                new Item(new BigDecimal("40.00")),
                new Item(new BigDecimal("50.00"))
        ));

        var basketTotal2 = 0;

        for (Item item : items2) {
            basketTotal2 ++;
        }

        System.out.println("Basket 2 total: " + basketTotal2);



    }



}
