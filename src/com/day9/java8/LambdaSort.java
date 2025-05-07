package com.day9.java8;

import java.util.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - ₹" + price;
    }
}

public class LambdaSort {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Mobile", 20000),
            new Product("Laptop", 60000),
            new Product("Headphones", 1500)
        );

        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));

        System.out.println("Sorted Products by Price:");
        products.forEach(System.out::println);
    }
}
