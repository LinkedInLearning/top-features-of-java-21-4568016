package com.example;

public class Main {

    public static void main(String[] args) {

        var product1 = new FoodItem("Apple", 0.99);
        var product2 = new DrinkItem("Water", 1.29);

        printDetails(product1);
        printDetails(product2);

    }

    private static void printDetails(Item item) {
        if(item instanceof FoodItem) {
            var foodItem = (FoodItem) item;
            var name = foodItem.name();
            var price = foodItem.price();
            System.out.println("Food item with name " + name + " has price " + price);
        } else if(item instanceof DrinkItem) {
            var drinkItem = (DrinkItem) item;
            var name = drinkItem.name();
            var price = drinkItem.price();
            System.out.println("Drink item with name " + name + " has price " + price);
        }
    }

}
