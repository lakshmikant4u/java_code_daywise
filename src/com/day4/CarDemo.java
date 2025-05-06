package com.day4;

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();  // Object created
        myCar.brand = "Toyota";
        myCar.year = 2020;

        System.out.println("Brand: " + myCar.brand);
        myCar.startEngine();    // Method call
    }
}

class Car {
    // Attributes (fields)
    String brand;
    int year;

    // Method
    void startEngine() {
        System.out.println(brand + " engine started.");
    }
}
