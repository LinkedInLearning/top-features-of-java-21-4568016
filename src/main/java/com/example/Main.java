package com.example;

public class Main {

    public static void main(String[] args) {

        var house = new House("123 Main St", 3, true);
        var store = new Store("456 Elm St");

        printAddress(house);
        printAddress(store);

    }

    private static void printAddress(Building building) {
        if (building instanceof House house) {
            System.out.println("House address: " + house.address());
        } else if (building instanceof Store store) {
            System.out.println("Store address: " + store.address());
        }
    }


}
