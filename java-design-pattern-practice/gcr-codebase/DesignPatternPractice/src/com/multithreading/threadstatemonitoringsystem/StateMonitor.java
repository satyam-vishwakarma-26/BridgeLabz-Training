
package com.multithreading.threadstatemonitoringsystem;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class StateMonitor extends Thread {

    private Thread[] threads;
    private Map<String, Integer> stateCount = new HashMap<>();

    public StateMonitor(Thread[] threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        boolean allTerminated = false;

        while (!allTerminated) {
            allTerminated = true;

            for (Thread t : threads) {
                Thread.State state = t.getState();
                String name = t.getName();

                System.out.println("[Monitor] " + name + " is in " +
                        state + " state at " + LocalTime.now());

                stateCount.put(name, stateCount.getOrDefault(name, 0) + 1);

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            System.out.println("----------------------------------");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Monitor interrupted.");
            }
        }

        // Summary
        System.out.println("Summary:");
        for (String threadName : stateCount.keySet()) {
            System.out.println(threadName + " went through " +
                    stateCount.get(threadName) + " state checks");
        }
    }
}
