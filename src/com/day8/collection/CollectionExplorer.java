package com.day8.collection;

import java.util.*;

public class CollectionExplorer {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== Java Collections Explorer ===");
            System.out.println("1. Shopping Cart (ArrayList)");
            System.out.println("2. Bank Transactions (LinkedList)");
            System.out.println("3. Voter ID Registry (HashSet)");
            System.out.println("4. Password History (LinkedHashSet)");
            System.out.println("5. Student Roll Numbers (TreeSet)");
            System.out.println("6. Emergency Room Queue (PriorityQueue)");
            System.out.println("7. Login System (HashMap)");
            System.out.println("8. Appointment Scheduler (TreeMap)");
            System.out.println("9. Browser History (Stack)");
            System.out.println("0. Exit");
            System.out.print("Choose a collection demo: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> shoppingCartDemo();
                case 2 -> bankTransactionsDemo();
                case 3 -> voterIDDemo();
                case 4 -> passwordHistoryDemo();
                case 5 -> studentRollsDemo();
                case 6 -> emergencyRoomDemo();
                case 7 -> loginSystemDemo();
                case 8 -> appointmentSchedulerDemo();
                case 9 -> browserHistoryDemo();
                case 0 -> System.out.println("Exiting... Thank you!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }

    static void shoppingCartDemo() {
        List<String> cart = new ArrayList<>(List.of("iPhone", "Laptop", "iPhone"));
        System.out.println("Items in Cart:");
        cart.forEach(item -> System.out.println("- " + item));
    }

    static void bankTransactionsDemo() {
        LinkedList<String> log = new LinkedList<>();
        log.add("Deposited ₹5000");
        log.add("Withdrew ₹2000");
        log.addFirst("Account Opened");
        log.forEach(entry -> System.out.println("- " + entry));
    }

    static void voterIDDemo() {
        Set<String> voterIDs = new HashSet<>(Set.of("IND12345", "IND67890", "IND12345"));
        System.out.println("Unique Voter IDs:");
        voterIDs.forEach(id -> System.out.println("- " + id));
    }

    static void passwordHistoryDemo() {
        Set<String> passwords = new LinkedHashSet<>(List.of("Pass@123", "Pass@124", "Pass@123"));
        System.out.println("Recent Passwords:");
        passwords.forEach(p -> System.out.println("- " + p));
    }

    static void studentRollsDemo() {
        Set<Integer> rolls = new TreeSet<>(Set.of(102, 101, 103));
        System.out.println("Sorted Roll Numbers:");
        rolls.forEach(r -> System.out.println("- Roll No: " + r));
    }

    static void emergencyRoomDemo() {
        Queue<String> queue = new PriorityQueue<>(List.of("Patient-Normal", "Patient-Critical", "Patient-Urgent"));
        System.out.println("Serving Patients by Priority:");
        while (!queue.isEmpty()) {
            System.out.println("- " + queue.poll());
        }
    }

    static void loginSystemDemo() {
        Map<String, String> users = new HashMap<>();
        users.put("ravi.kumar", "ravi@123");
        users.put("anita.singh", "anita@789");

        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (users.containsKey(user) && users.get(user).equals(pass)) {
            System.out.println("✅ Login successful. Welcome, " + user + "!");
        } else {
            System.out.println("❌ Invalid credentials.");
        }
    }

    static void appointmentSchedulerDemo() {
        Map<String, String> appointments = new TreeMap<>();
        appointments.put("2025-05-10", "Dentist - Dr. Kapoor");
        appointments.put("2025-05-07", "Eye Checkup - Dr. Nair");
        System.out.println("Your Appointments:");
        appointments.forEach((d, a) -> System.out.println(d + " → " + a));
    }

    static void browserHistoryDemo() {
        Stack<String> history = new Stack<>();
        history.push("Google");
        history.push("YouTube");
        history.push("StackOverflow");

        System.out.println("Back Navigation (LIFO):");
        while (!history.isEmpty()) {
            System.out.println("Back to: " + history.pop());
        }
    }
}
