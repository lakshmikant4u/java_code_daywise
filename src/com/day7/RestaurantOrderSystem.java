package com.day7;

import java.util.Random;

class Order implements Runnable {
    private String customerName;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void run() {
        synchronized (Kitchen.class) {
            System.out.println("Order placed by " + customerName + ".");
            try {
                int cookingTime = new Random().nextInt(5000) + 1000;  // Cooking time between 1-6 seconds
                Thread.sleep(cookingTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order for " + customerName + " is ready.");
        }
    }
}

class Kitchen {
    public void takeOrder(String customerName) {
        Thread orderThread = new Thread(new Order(customerName));
        orderThread.start();
    }
}

public class RestaurantOrderSystem {
    public static void main(String[] args) throws InterruptedException {
        Kitchen kitchen = new Kitchen();

        // Simulating orders from different customers
        kitchen.takeOrder("John");
        kitchen.takeOrder("Alice");
        kitchen.takeOrder("Bob");
        kitchen.takeOrder("Charlie");

        // Adding a delay to let all threads finish before exiting the main thread
        Thread.sleep(10000);  // Wait for all orders to complete
        System.out.println("All orders are processed.");
    }
}
