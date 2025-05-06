package com.day6.login_system;

import java.util.Scanner;

class LoginFailedException extends Exception {
    public LoginFailedException(String message) {
        super(message);
    }
}

class LoginSystem {
    private final String validUsername = "admin";
    private final String validPassword = "pass123";

    public void login(String username, String password) throws LoginFailedException {
        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new LoginFailedException("Invalid username or password.");
        }
    }
}

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginSystem system = new LoginSystem();

        try {
            System.out.print("Enter Username: ");
            String uname = scanner.nextLine();

            System.out.print("Enter Password: ");
            String pwd = scanner.nextLine();

            system.login(uname, pwd);
            System.out.println("Login successful. Welcome " + uname + "!");
        } catch (LoginFailedException e) {
            System.out.println("Login Error: " + e.getMessage());
        } finally {
            System.out.println("Login attempt complete.");
            scanner.close();
        }
    }
}
