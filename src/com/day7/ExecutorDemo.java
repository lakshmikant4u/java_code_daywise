package com.day7;

import java.util.concurrent.*;

public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            executorService.submit(new RunnableTask());
        }
        
        executorService.shutdown();
    }
}

class RunnableTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing a task.");
    }
}
