package com.day6;

class AgeValidationException extends Exception {
    public AgeValidationException(String message) {
        super(message);
    }
}

public class ExceptionExample2 {
    public static void validateAge(int age) throws AgeValidationException {
        if (age < 18) {
            throw new AgeValidationException("You must be at least 18 years old.");
        } else {
            System.out.println("Age accepted: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // Try changing this to 20
        } catch (AgeValidationException ex) {
            System.out.println("Validation Error: " + ex.getMessage());
        } finally {
            System.out.println("Validation complete.");
        }
    }
}
