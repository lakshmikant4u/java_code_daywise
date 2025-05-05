package com.day1;

import java.util.Scanner;

public class MenuTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Calculator");
            System.out.println("2. Pattern Generator");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    System.out.println("Operations: + - * / %");
                    System.out.print("Enter operation: ");
                    char op = sc.next().charAt(0);

                    double result = 0;
                    boolean valid = true;

                    if (op == '+') result = a + b;
                    else if (op == '-') result = a - b;
                    else if (op == '*') result = a * b;
                    else if (op == '/') result = (b != 0) ? a / b : 0;
                    else if (op == '%') result = a % b;
                    else {
                        System.out.println("Invalid operator");
                        valid = false;
                    }

                    if (valid) {
                        System.out.println("Result = " + result);
                    }
                    break;

                case 2:
                    System.out.print("Enter number of rows for pattern: ");
                    int rows = sc.nextInt();

                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
