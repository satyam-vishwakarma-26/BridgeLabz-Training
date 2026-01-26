
package com.annotations.repeatableannotation;
public class Software {

    @BugReport(description = "Null pointer issue on login")
    @BugReport(description = "Performance issue on dashboard")
    public void runApplication() {
        System.out.println("Application running");
    }
}
