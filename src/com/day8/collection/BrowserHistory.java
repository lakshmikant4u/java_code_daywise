package com.day8.collection;

import java.util.*;

public class BrowserHistory {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        history.push("Google");
        history.push("YouTube");
        history.push("StackOverflow");

        System.out.println("Back Navigation:");
        while (!history.isEmpty()) {
            System.out.println("Back to: " + history.pop());
        }
    }
}
