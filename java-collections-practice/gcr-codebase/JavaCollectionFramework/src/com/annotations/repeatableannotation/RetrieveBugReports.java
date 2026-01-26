
package com.annotations.repeatableannotation;
import java.lang.reflect.Method;

public class RetrieveBugReports {

    public static void main(String[] args) {

        try {
            // Get Software class
            Class<Software> cls = Software.class;

            // Get method
            Method method = cls.getMethod("runApplication");

            // Retrieve all BugReport annotations
            BugReport[] reports =
                    method.getAnnotationsByType(BugReport.class);

            // Print bug reports
            for (BugReport report : reports) {
                System.out.println("Bug: " + report.description());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
