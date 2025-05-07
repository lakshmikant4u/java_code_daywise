package com.day9.java8.product_inventory_filter;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Product {
    String name;
    String category;
    double price;

    Product(String name, String category, double price) {
        this.name = name; this.category = category;
        this.price = price;
    }

    public String toString() {
        return name + " (" + category + ") → ₹" + price;
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", "Electronics", 75000),
            new Product("Notebook", "Stationery", 50),
            new Product("Smartphone", "Electronics", 30000),
            new Product("Pen", "Stationery", 10)
        );

        Predicate<Product> expensive = p -> p.price > 1000;
        Predicate<Product> isElectronics = p -> p.category.equals("Electronics");

        Consumer<Product> show = p -> System.out.println(p);

        System.out.println("Expensive Electronics:");
        products.stream()
                .filter(expensive.and(isElectronics))
                .forEach(show);
    }
}
