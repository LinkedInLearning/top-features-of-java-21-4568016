package com.example;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> items = List.of(
                new Item(new BigDecimal("10.00")),
                new Item(new BigDecimal("20.00")),
                new Item(new BigDecimal("30.00"))
        );

        var basketTotal = 0;

        for (Item item : items) {
            basketTotal ++;
        }

        System.out.println("Basket total: " + basketTotal);


    }



}
