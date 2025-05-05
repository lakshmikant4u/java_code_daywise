package com.day1;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.print("Enter second number: ");
        int num2 = Integer.parseInt(sc.nextLine());

        // Comparison using relational and ternary operators
        String comparisonResult = (num1 > num2) ? "Greater" :
                                  (num1 < num2) ? "Smaller" : "Equal";

        // Arithmetic and assignment operator
        int result = (num1 > num2) ? (num1 - num2) : (num1 + num2);

        // Output
        System.out.println("\nComparison: First number is " + comparisonResult);
        System.out.println("Computed value (difference or sum): " + result);

        sc.close();
    }
}
