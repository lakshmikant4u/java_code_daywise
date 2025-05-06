package com.day7.foodorderingsystem;

import java.util.concurrent.*;
import java.time.LocalTime;

public class FoodOrderSystem {

    // Simulate delay
    private static void delay(int seconds) {
        try { Thread.sleep(seconds * 1000); } catch (InterruptedException e) { e.printStackTrace(); }
    }

    // Simulate fetching menu
    public static CompletableFuture<String> fetchMenu() {
        return CompletableFuture.supplyAsync(() -> {
            log("Fetching menu...");
            delay(2);
            return "Menu: Idli, Dosa, Vada";
        });
    }

    // Simulate placing an order
    public static CompletableFuture<String> placeOrder(String item) {
        return CompletableFuture.supplyAsync(() -> {
            log("Placing order for: " + item);
            delay(2);
            return "Order placed for " + item;
        });
    }

    // Simulate payment
    public static CompletableFuture<String> processPayment(double amount) {
        return CompletableFuture.supplyAsync(() -> {
            log("Processing payment of ₹" + amount);
            delay(2);
            return "Payment of ₹" + amount + " successful";
        });
    }

    // Send confirmation
    public static CompletableFuture<Void> sendConfirmation(String msg) {
        return CompletableFuture.runAsync(() -> {
            log("Sending confirmation: " + msg);
            delay(1);
            log("Confirmation sent.");
        });
    }

    // Virtual Thread Runner
    public static void handleCustomerRequest(String item, double amount) {
        Thread.startVirtualThread(() -> {
            log("🧑‍🍳 New virtual thread for order");

            fetchMenu()
            .thenCompose(menu -> {
                log(menu);
                return placeOrder(item);
            })
            .thenCompose(order -> {
                log(order);
                return processPayment(amount);
            })
            .thenCompose(payment -> {
                log(payment);
                return sendConfirmation("Your order for " + item + " is confirmed!");
            })
            .join(); // wait for all
        });
    }

    private static void log(String msg) {
        System.out.println(LocalTime.now() + " [" + Thread.currentThread() + "] - " + msg);
    }

    public static void main(String[] args) {
        // Simulate multiple users
        handleCustomerRequest("Idli", 50.0);
        handleCustomerRequest("Dosa", 70.0);
        handleCustomerRequest("Vada", 30.0);

        // Prevent main from exiting too early
        try { Thread.sleep(10000); } catch (InterruptedException e) { }
    }
}
