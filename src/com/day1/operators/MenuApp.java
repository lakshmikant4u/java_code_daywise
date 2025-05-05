package com.day1.operators;

import java.util.*;
import java.io.*;

class UserAuth {
    private final String username = "admin";
    private final String password = "1234";

    public boolean login(Scanner sc) {
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        return user.equals(username) && pass.equals(password);
    }
}

class Calculator {
    public double calculate(double a, double b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> (b != 0) ? a / b : 0;
            case '%' -> a % b;
            default -> {
                System.out.println("Invalid operation.");
                yield 0;
            }
        };
    }
}

class PatternPrinter {
    public void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Logger {
    private final String filename = "activity_log.txt";

    public void log(String message) {
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(message + "\n");
        } catch (IOException e) {
            System.out.println("Logging failed.");
        }
    }
}

public class MenuApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAuth auth = new UserAuth();
        Calculator calc = new Calculator();
        PatternPrinter printer = new PatternPrinter();
        Logger logger = new Logger();

        System.out.println("=== Welcome ===");
        if (!auth.login(sc)) {
            System.out.println("Login failed.");
            return;
        }

        int choice;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Calculator");
            System.out.println("2. Pattern Generator");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter first number: ");
                    double a = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter second number: ");
                    double b = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter operation (+, -, *, /, %): ");
                    char op = sc.nextLine().charAt(0);

                    double result = calc.calculate(a, b, op);
                    System.out.println("Result: " + result);
                    logger.log("Calculator: " + a + " " + op + " " + b + " = " + result);
                }
                case 2 -> {
                    System.out.print("Enter number of rows: ");
                    int rows = Integer.parseInt(sc.nextLine());
                    printer.printTriangle(rows);
                    logger.log("Pattern: " + rows + " rows printed");
                }
                case 3 -> System.out.println("Exiting program...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        sc.close();
    }
}
