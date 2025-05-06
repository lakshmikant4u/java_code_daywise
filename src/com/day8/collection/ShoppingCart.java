package com.day8.collection;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("iPhone");
        cart.add("Laptop");
        cart.add("iPhone"); // duplicate allowed

        System.out.println("Shopping Cart:");
        for (String item : cart) {
            System.out.println("- " + item);
        }
    }
}
