package com.day8.collection;

import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {
        Map<String, String> loginMap = new HashMap<>();
        loginMap.put("ravi.kumar", "ravi@123");
        loginMap.put("anita.singh", "anita@789");

        String user = "ravi.kumar";
        String pass = "ravi@123";

        if (loginMap.containsKey(user) && loginMap.get(user).equals(pass)) {
            System.out.println("Welcome, " + user + "!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}

