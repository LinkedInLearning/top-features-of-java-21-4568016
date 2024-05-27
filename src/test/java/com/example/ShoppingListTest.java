package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingListTest {

    @Test
    void testGetFirstItem() {
        ShoppingList shoppingList = new ShoppingList();
        String firstItem = shoppingList.getFirstItem();

        assertEquals("Bread", firstItem);
    }

    @Test
    void testGetLastItem() {
        ShoppingList shoppingList = new ShoppingList();
        String lastItem = shoppingList.getLastItem();

        assertEquals("Butter", lastItem);
    }

}
