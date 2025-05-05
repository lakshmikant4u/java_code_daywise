package com.day3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== STRING HANDLING TOOL ===");
            System.out.println("1. String (Immutable)");
            System.out.println("2. StringBuffer (Thread-safe)");
            System.out.println("3. StringBuilder (Fast, not thread-safe)");
            System.out.println("4. StringTokenizer (Split String)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    // String (Immutable)
                    System.out.print("Enter a base string: ");
                    String base = sc.nextLine();
                    System.out.print("Enter a string to append: ");
                    String add = sc.nextLine();

                    String result = base.concat(add);
                    System.out.println("Original: " + base);
                    System.out.println("Appended (new object): " + result);
                    break;

                case 2:
                    // StringBuffer (Thread-safe, Mutable)
                    System.out.print("Enter initial StringBuffer: ");
                    StringBuffer sbf = new StringBuffer(sc.nextLine());
                    sbf.append(" [Appended]");
                    sbf.insert(0, "[Start] ");
                    sbf.reverse();
                    System.out.println("Modified StringBuffer: " + sbf);
                    break;

                case 3:
                    // StringBuilder (Fast, Mutable)
                    System.out.print("Enter initial StringBuilder: ");
                    StringBuilder sb = new StringBuilder(sc.nextLine());
                    sb.append(" [Quick]");
                    sb.replace(0, 3, "###");
                    System.out.println("Modified StringBuilder: " + sb);
                    break;

                case 4:
                    // StringTokenizer (Split)
                    System.out.print("Enter a comma-separated list: ");
                    String list = sc.nextLine();
                    StringTokenizer st = new StringTokenizer(list, ",");

                    System.out.println("Tokens:");
                    while (st.hasMoreTokens()) {
                        System.out.println("- " + st.nextToken().trim());
                    }
                    break;

                case 5:
                    System.out.println("Exiting tool. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
