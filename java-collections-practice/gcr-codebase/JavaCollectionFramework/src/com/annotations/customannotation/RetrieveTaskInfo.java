package com.annotations.customannotation;
import java.lang.reflect.Method;

public class RetrieveTaskInfo {

    public static void main(String[] args) {

        try {
            // Get TaskManager class
            Class<TaskManager> cls = TaskManager.class;

            // Get method
            Method method = cls.getMethod("completeTask");

            // Check annotation
            if (method.isAnnotationPresent(TaskInfo.class)) {

                // Retrieve annotation
                TaskInfo info = method.getAnnotation(TaskInfo.class);

                // Print annotation details
                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}