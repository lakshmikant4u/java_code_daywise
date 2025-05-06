package com.day4.inheritance;

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    String department;
    double salary;

    void showEmployeeDetails() {
        displayInfo(); // inherited
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rohan Mehta";
        emp.age = 30;
        emp.department = "IT";
        emp.salary = 85000;

        emp.showEmployeeDetails();
    }
}
