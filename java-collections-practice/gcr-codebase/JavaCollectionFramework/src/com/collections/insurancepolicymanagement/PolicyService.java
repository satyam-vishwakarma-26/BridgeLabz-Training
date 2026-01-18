package com.collections.insurancepolicymanagement;
import java.time.LocalDate;
import java.util.Set;

public class PolicyService {

    public static void displayAll(Set<Policy> policies) {
        for (Policy p : policies) {
            System.out.println(p);
        }
    }

    // policies expiring within next 30 days
    public static void expiringSoon(Set<Policy> policies) {
        LocalDate today = LocalDate.now();
        for (Policy p : policies) {
            if (!p.expiryDate.isBefore(today) &&
                p.expiryDate.isBefore(today.plusDays(30))) {
                System.out.println(p);
            }
        }
    }

    public static void byCoverageType(Set<Policy> policies, String type) {
        for (Policy p : policies) {
            if (p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }
}