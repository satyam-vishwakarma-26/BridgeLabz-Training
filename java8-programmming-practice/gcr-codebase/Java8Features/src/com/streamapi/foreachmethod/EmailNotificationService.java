package com.streamapi.foreachmethod;
import java.util.*;

public class EmailNotificationService {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
            "satyam@example.com",
            "vishal@example.com",
            "shivi@example.com"
        );

        // Send notification to each email
        emails.forEach(email -> sendEmailNotification(email));
    }

    // Simulated email sender
    private static void sendEmailNotification(String email) {
        System.out.println("📨 Notification email sent to: " + email);
    }
}
