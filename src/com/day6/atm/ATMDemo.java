package com.day6.atm;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class ATM {
    private double balance = 10000.0;
    private final int correctPin = 1234;

    public void authenticate(int pin) throws SecurityException {
        if (pin != correctPin) {
            throw new SecurityException("Invalid PIN!");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
        System.out.println("Remaining Balance: ₹" + balance);
    }

    public double checkBalance() {
        return balance;
    }
}

public class ATMDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();

        try {
            System.out.print("Enter PIN: ");
            int pin = scanner.nextInt();
            atm.authenticate(pin);

            System.out.println("1. Check Balance\n2. Withdraw\nEnter choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + atm.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double amt = scanner.nextDouble();
                    atm.withdraw(amt);
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } catch (SecurityException se) {
            System.out.println("Authentication Failed: " + se.getMessage());
        } catch (InsufficientBalanceException ibe) {
            System.out.println("Transaction Failed: " + ibe.getMessage());
        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using our ATM.");
            scanner.close();
        }
    }
}
