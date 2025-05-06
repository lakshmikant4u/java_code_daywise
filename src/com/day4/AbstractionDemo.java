package com.day4;

abstract class Animal {
    abstract void sound();  // Abstract method
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Output: Dog barks
    }
}
