
package com.multithreading.threadstatemonitoringsystem;

public class ThreadStateMonitoring {

    public static void main(String[] args) {

        Thread task1 = new Thread(new TaskRunner("Task-1"), "Task-1");
        Thread task2 = new Thread(new TaskRunner("Task-2"), "Task-2");

        Thread[] tasks = { task1, task2 };

        StateMonitor monitor = new StateMonitor(tasks);

        // Observe NEW state
        monitor.start();

        task1.start();
        task2.start();
    }
}
