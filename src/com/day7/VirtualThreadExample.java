package com.day7;

public class VirtualThreadExample {
    public static void main(String[] args) {
        Thread.startVirtualThread(() -> {
            System.out.println("Running in virtual thread: " + Thread.currentThread());
        });

        System.out.println("Main thread: " + Thread.currentThread());
    }
}
