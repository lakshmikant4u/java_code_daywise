package com.day7.logistics_task_manager;

public class LogisticsManager {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int deliveryId = i;
            Thread.startVirtualThread(() -> trackDelivery(deliveryId));
        }

        // Keep main alive for demo
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        System.out.println("✅ All delivery tracking started.");
    }

    static void trackDelivery(int id) {
        System.out.println("Delivery #" + id + " started by " + Thread.currentThread());
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Delivery #" + id + " updated location.");
    }
}
