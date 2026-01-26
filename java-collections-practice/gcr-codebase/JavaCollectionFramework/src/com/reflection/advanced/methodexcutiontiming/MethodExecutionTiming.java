
package com.reflection.advanced.methodexcutiontiming;

import java.lang.reflect.Method;

public class MethodExecutionTiming {

    public static void main(String[] args) {

        try {
            // Create object
            SampleTasks obj = new SampleTasks();

            // Get Class object
            Class<?> cls = obj.getClass();

            // Get all methods
            Method[] methods = cls.getDeclaredMethods();

            // Invoke each method and measure time
            for (Method method : methods) {

                long startTime = System.nanoTime();

                method.invoke(obj);

                long endTime = System.nanoTime();

                long executionTime = endTime - startTime;

                System.out.println(
                    "Method: " + method.getName() +
                    " | Time: " + executionTime + " ns"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
