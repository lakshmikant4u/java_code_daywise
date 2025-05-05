package com.day1;

public class VariablesDemo {
	public static void main(String[] args) {
		
	}
}

class Person {
	int age = 30; // Instance variable
	static String species = "Human"; // Static variable

	public void showAge() {
		int years = 5; // Local variable
		System.out.println("Age: " + (age + years));
	}
}

class Circle {
	final double PI = 3.14; // Constant

	public double getArea(double radius) {
		return PI * radius * radius;
	}
}
