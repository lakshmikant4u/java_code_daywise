package com.day1;

import java.util.Scanner;

public class FullFlowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter up to 5 positive numbers. Enter -1 to stop early.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("Early exit detected using break.");
                break; // stops loop early
            }

            if (num < 0) {
                System.out.println("Negative number ignored (continue).");
                continue; // skips adding to total
            }

            total += num;

            // Use switch to classify number
            switch (num % 2) {
                case 0:
                    System.out.println("It's an even number.");
                    break;
                case 1:
                    System.out.println("It's an odd number.");
                    break;
            }
        }

        // Final output
        if (total > 0) {
            System.out.println("Sum of entered positive numbers: " + total);
        } else {
            System.out.println("No valid numbers entered.");
        }

        sc.close();
    }
}
