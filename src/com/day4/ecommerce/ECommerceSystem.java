package com.day4.ecommerce;

public class ECommerceSystem {
    public static void main(String[] args) {
        // Admin setup
        Admin admin = new Admin("Rajesh Kumar", "rajesh@admin.in", "Product Manager");
        admin.showDetails();
        System.out.println();

        // Adding product
        Product prod = new Product("Samsung Galaxy M14", 13999);
        admin.addProduct(prod);
        System.out.println();

        // Customer shopping
        Customer customer = new Customer("Nidhi Verma", "nidhi.verma@gmail.com", "Noida, Uttar Pradesh");
        customer.showDetails();
        System.out.println();

        prod.displayProduct();
        customer.makePayment(prod.getPrice());
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public void displayProduct() {
        System.out.println("📦 Product: " + name + " | ₹" + price);
    }
}

class Admin extends User {
    private String role;

    public Admin(String name, String email, String role) {
        super(name, email);
        this.role = role;
    }

    @Override
    public void showDetails() {
        System.out.println("🛠️ Admin: " + name);
        System.out.println("📧 Email: " + email);
        System.out.println("🔐 Role: " + role);
    }

    public void addProduct(Product p) {
        System.out.println("✅ Product \"" + p.getName() + "\" added to catalog.");
    }
}

class Customer extends User implements Payable {
    private String deliveryAddress;

    public Customer(String name, String email, String deliveryAddress) {
        super(name, email);
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void showDetails() {
        System.out.println("👤 Customer: " + name);
        System.out.println("📧 Email: " + email);
        System.out.println("🏠 Address: " + deliveryAddress);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("💳 ₹" + amount + " paid successfully via UPI.");
    }
}

interface Payable {
    void makePayment(double amount);
}

abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void showDetails();
}


