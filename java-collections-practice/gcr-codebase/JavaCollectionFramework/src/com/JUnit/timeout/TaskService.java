package com.JUnit.timeout;
public class TaskService {

    public static String longRunningTask() throws InterruptedException {
        // Simulate long-running task (3 seconds)
        Thread.sleep(3000);
        return "Task Completed";
    }
}