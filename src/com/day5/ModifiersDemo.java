package com.day5;

public class ModifiersDemo {

    // 1. Access Modifiers
    public int publicVar = 100;
    private int privateVar = 200;
    protected int protectedVar = 300;
    int defaultVar = 400; // default access

    // 2. Static Modifier
    static int staticCounter = 0;

    // 3. Final Modifier
    public final int FINAL_CONSTANT = 999;

    // 4. Volatile Modifier
    private volatile boolean isRunning = true;

    // 5. Native Modifier (just declared, not implemented here)
    public native void nativeMethod();

    // 6. Synchronized Method
    public synchronized void synchronizedMethod() {
        System.out.println("Synchronized method accessed by thread: " + Thread.currentThread().getName());
    }

    // Static Method
    public static void incrementCounter() {
        staticCounter++;
        System.out.println("Static counter: " + staticCounter);
    }

    // Final Method (cannot be overridden)
    public final void finalMethod() {
        System.out.println("Final method executed. Constant value: " + FINAL_CONSTANT);
    }

    // Private method
    private void privateMethod() {
        System.out.println("Accessed private method: privateVar = " + privateVar);
    }

    // Method to demonstrate access
    public void showAll() {
        System.out.println("Public var: " + publicVar);
        System.out.println("Private var: " + privateVar);
        System.out.println("Protected var: " + protectedVar);
        System.out.println("Default var: " + defaultVar);

        privateMethod(); // Accessing private method
        finalMethod();   // Final method
    }

    // Thread to demonstrate volatile usage
    public void startThreadDemo() {
        Thread worker = new Thread(() -> {
            while (isRunning) {
                System.out.println("Worker thread is running...");
                try { Thread.sleep(500); } catch (Exception e) {}
            }
            System.out.println("Worker thread stopped.");
        });

        worker.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {}

        isRunning = false; // volatile ensures worker sees this change
    }

    // Main method to test everything
    public static void main(String[] args) {
        ModifiersDemo demo = new ModifiersDemo();

        System.out.println("🔍 Access Modifier Demo:");
        demo.showAll();

        System.out.println("\n⚙️ Static Modifier Demo:");
        incrementCounter();
        incrementCounter();

        System.out.println("\n🔒 Synchronized Modifier Demo:");
        Thread t1 = new Thread(() -> demo.synchronizedMethod(), "T1");
        Thread t2 = new Thread(() -> demo.synchronizedMethod(), "T2");
        t1.start();
        t2.start();

        try { Thread.sleep(1000); } catch (Exception e) {}

        System.out.println("\n🌀 Volatile Modifier Demo:");
        demo.startThreadDemo();
    }
}
