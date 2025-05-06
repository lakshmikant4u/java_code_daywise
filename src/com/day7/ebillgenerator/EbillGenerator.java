package com.day7.ebillgenerator;

import java.util.concurrent.*;

public class EbillGenerator {

    public static void main(String[] args) {
        String customerId = "CUST123";

        CompletableFuture.supplyAsync(() -> getCustomerDetails(customerId))
                .thenCompose(customer -> CompletableFuture.supplyAsync(() -> fetchUsageData(customer)))
                .thenCompose(usage -> CompletableFuture.supplyAsync(() -> calculateBill(usage)))
                .thenAccept(EbillGenerator::sendInvoice)
                .join();

        System.out.println("✔ Bill process completed!");
    }

    static String getCustomerDetails(String customerId) {
        sleep(1);
        System.out.println("Fetched customer: " + customerId);
        return "Ravi Kumar (ID: " + customerId + ")";
    }

    static int fetchUsageData(String customer) {
        sleep(2);
        int usage = 340; // units
        System.out.println("Fetched usage for " + customer + ": " + usage + " units");
        return usage;
    }

    static String calculateBill(int units) {
        sleep(1);
        double amount = units * 7.5; // ₹ per unit
        return "Bill Amount: ₹" + amount + " for " + units + " units";
    }

    static void sendInvoice(String billDetails) {
        sleep(1);
        System.out.println("Invoice sent to user: " + billDetails);
    }

    static void sleep(int seconds) {
        try { Thread.sleep(seconds * 1000); } catch (InterruptedException e) {}
    }
}
