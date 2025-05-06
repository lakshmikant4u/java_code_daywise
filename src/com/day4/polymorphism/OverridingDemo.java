package com.day4.polymorphism;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Honda Shine is starting...");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // Polymorphic reference
        v.start();  // Output: Honda Shine is starting...
    }
}
