package com.lanbdaexpressions.notificationfiltering;
import java.util.*;
import java.util.function.Predicate;

public class HospitalAlerts {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("Heart rate critical", "EMERGENCY"),
            new Alert("Take insulin at 8 AM", "MEDICATION"),
            new Alert("Doctor appointment at 5 PM", "APPOINTMENT"),
            new Alert("New health tips available", "GENERAL")
        );

        // User wants only emergency alerts
        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equals("EMERGENCY");

        System.out.println("Emergency Alerts:");
        filterAlerts(alerts, emergencyOnly);

        // User wants Emergency + Medication alerts
        Predicate<Alert> emergencyAndMedication =
                alert -> alert.type.equals("EMERGENCY")
                      || alert.type.equals("MEDICATION");

        System.out.println("\nEmergency & Medication Alerts:");
        filterAlerts(alerts, emergencyAndMedication);
    }

    static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
        for (Alert alert : alerts) {
            if (condition.test(alert)) {
                System.out.println(alert);
            }
        }
    }
}