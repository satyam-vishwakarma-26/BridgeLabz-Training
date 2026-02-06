
package com.multithreading.threadstatemonitoringsystem;

class TaskRunner implements Runnable {

    private String taskName;

    public TaskRunner(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            // Simulate computation (RUNNABLE)
            for (int i = 0; i < 1_000_000; i++) {
                Math.sqrt(i);
            }

            // Sleep to enter TIMED_WAITING
            Thread.sleep(2000);

            // More computation
            for (int i = 0; i < 1_000_000; i++) {
                Math.pow(i, 2);
            }

        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted.");
        }
    }
}
