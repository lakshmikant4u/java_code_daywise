package com.day7.taskmanagersystem;

import java.util.concurrent.*;
import java.util.*;

class Task implements Callable<String> {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws InterruptedException {
        int duration = new Random().nextInt(3000) + 1000; // Task takes between 1-4 seconds
        System.out.println("Executing task: " + taskName + " for " + duration + " milliseconds.");
        Thread.sleep(duration);
        return taskName + " completed in " + duration + " ms.";
    }
}

public class TaskManagerSystem {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3); // Thread pool with 3 threads
        List<Future<String>> taskResults = new ArrayList<>();
        
        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            Task task = new Task("Task " + i);
            taskResults.add(executorService.submit(task));
        }

        // Get the results
        for (Future<String> result : taskResults) {
            try {
                System.out.println(result.get());  // Blocking call to get the result
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();  // Shutdown the executor service
    }
}
