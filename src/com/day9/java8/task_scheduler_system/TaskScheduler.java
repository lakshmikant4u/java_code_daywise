package com.day9.java8.task_scheduler_system;

import java.util.*;
import java.util.function.*;

class Task {
    int id;
    String description;

    Task(int id, String description) {
        this.id = id; this.description = description;
    }

    public String toString() {
        return id + ": " + description;
    }
}

public class TaskScheduler {
    static int counter = 1;

    public static void main(String[] args) {
        List<Task> taskList = new ArrayList<>();

        Supplier<Integer> taskIdGenerator = () -> counter++;
        Function<String, Task> createTask = desc -> new Task(taskIdGenerator.get(), desc);
        Consumer<Task> executeTask = task -> System.out.println("Executing Task → " + task.description);

        // Add Tasks
        taskList.add(createTask.apply("Backup Database"));
        taskList.add(createTask.apply("Generate Sales Report"));
        taskList.add(createTask.apply("Notify Clients"));

        // List and Execute
        System.out.println("Task List:");
        taskList.forEach(System.out::println);

        System.out.println("\nExecuting Tasks:");
        taskList.forEach(executeTask);
    }
}
