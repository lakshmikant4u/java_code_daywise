package com.day9.java8.inventory_analyzer;

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Product {
    String name;
    String category;
    double price;
    int quantity;

    Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " (" + category + ") → ₹" + price + " × " + quantity;
    }
}

public class InventoryAnalyzer {
    public static void main(String[] args) {
        List<Product> inventory = Arrays.asList(
            new Product("Laptop", "Electronics", 70000, 5),
            new Product("Mobile", "Electronics", 30000, 10),
            new Product("Pen", "Stationery", 10, 500),
            new Product("Notebook", "Stationery", 50, 300),
            new Product("Chair", "Furniture", 1500, 20)
        );

        System.out.println("🔍 Products > ₹1000:");
        inventory.stream()
                .filter(p -> p.price > 1000)
                .forEach(System.out::println);

        System.out.println("\n📦 Grouped by Category:");
        Map<String, List<Product>> byCategory = inventory.stream()
                .collect(Collectors.groupingBy(p -> p.category));
        byCategory.forEach((cat, list) -> {
            System.out.println(cat + ":");
            list.forEach(p -> System.out.println(" - " + p.name));
        });

        System.out.println("\n💰 Most Expensive Product:");
        inventory.stream()
                .max(Comparator.comparingDouble(p -> p.price))
                .ifPresent(System.out::println);
    }
}
