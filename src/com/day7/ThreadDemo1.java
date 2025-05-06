package com.day7;

class MyThread1 extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start(); // Start the thread
    }
}
