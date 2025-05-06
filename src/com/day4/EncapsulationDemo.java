package com.day4;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Rajesh");

        System.out.println("ID: " + emp.getEmpId());
        System.out.println("Name: " + emp.getName());
    }
}

class Employee {
    private int empId;
    private String name;

    // Getter
    public int getEmpId() {
        return empId;
    }

    // Setter
    public void setEmpId(int id) {
        empId = id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}
