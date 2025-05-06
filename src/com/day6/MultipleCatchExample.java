package com.day6;

public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[5]); // ArrayIndexOutOfBoundsException
            int x = 10 / 0;              // ArithmeticException (won't reach here)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } finally {
            System.out.println("Execution finished.");
        }
    }
}
