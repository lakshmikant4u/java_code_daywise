package com.day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Sum: " + (num1 + num2));
    }
}
