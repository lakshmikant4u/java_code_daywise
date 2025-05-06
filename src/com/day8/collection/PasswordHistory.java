package com.day8.collection;

import java.util.*;

public class PasswordHistory {
    public static void main(String[] args) {
        Set<String> passwords = new LinkedHashSet<>();
        passwords.add("Pass@123");
        passwords.add("Pass@124");
        passwords.add("Pass@123"); // won't add duplicate

        System.out.println("Old Passwords:");
        for (String pass : passwords) {
            System.out.println("- " + pass);
        }
    }
}
