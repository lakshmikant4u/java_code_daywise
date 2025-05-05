package com.day1;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        final double TAX_RATE = 0.05; // 5% tax
        String continueChoice;

        System.out.println("🛒 Welcome to the Simple Billing System");

        do {
            System.out.print("Enter product name: ");
            String name = sc.nextLine();

            System.out.print("Enter product price: ");
            double price = Double.parseDouble(sc.nextLine()); // String → double

            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(sc.nextLine()); // String → int

            // Add product to cart
            cart.add(new Product(name, price, quantity));

            System.out.print("Do you want to add another product? (yes/no): ");
            continueChoice = sc.nextLine().toLowerCase();

        } while (continueChoice.equals("yes"));

        // Display bill
        double subTotal = 0;

        System.out.println("\n====== BILL ======");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "Product", "Price", "Qty", "Total");

        for (Product p : cart) {
            double total = p.getTotal();
            subTotal += total;
            System.out.printf("%-15s %-10.2f %-10d %-10.2f\n", p.name, p.price, p.quantity, total);
        }

        double tax = subTotal * TAX_RATE;
        double grandTotal = subTotal + tax;

        System.out.printf("\nSubtotal: %.2f", subTotal);
        System.out.printf("\nTax (5%%): %.2f", tax);
        System.out.printf("\nGrand Total: %.2f\n", grandTotal);

        System.out.println("\nThank you for shopping!");
        sc.close();
    }
}

