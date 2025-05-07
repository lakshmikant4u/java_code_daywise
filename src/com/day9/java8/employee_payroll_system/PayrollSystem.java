package com.day9.java8.employee_payroll_system;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id; this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " (" + department + ") - ₹" + salary;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "Ravi", "IT", 65000),
            new Employee(102, "Neha", "HR", 50000),
            new Employee(103, "Amit", "Finance", 70000),
            new Employee(104, "Pooja", "IT", 55000)
        );

        Predicate<Employee> itDept = emp -> emp.department.equals("IT");
        Function<Employee, Double> bonusCalculator = emp -> emp.salary * 0.10;
        Consumer<Employee> print = emp -> System.out.println(emp);
        Supplier<String> companyName = () -> "ABC Solutions Pvt Ltd";

        System.out.println("Company: " + companyName.get());
        System.out.println("IT Department Employees:");
        employees.stream().filter(itDept).forEach(print);

        System.out.println("\nSalaries with Bonuses:");
        employees.forEach(emp -> {
            double bonus = bonusCalculator.apply(emp);
            System.out.println(emp.name + " → ₹" + (emp.salary + bonus));
        });
    }
}
