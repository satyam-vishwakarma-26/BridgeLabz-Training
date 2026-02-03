package com.streamapi.filterexpiring;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ExpiringMemberships {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member("Alice", LocalDate.now().plusDays(10)),
            new Member("Bob", LocalDate.now().plusDays(45)),
            new Member("Charlie", LocalDate.now().plusDays(25)),
            new Member("Diana", LocalDate.now().minusDays(5)), // already expired
            new Member("Ethan", LocalDate.now().plusDays(30))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()

            // Filter memberships expiring within next 30 days
            .filter(member ->
                !member.expiryDate.isBefore(today) &&
                !member.expiryDate.isAfter(next30Days)
            )

            .collect(Collectors.toList());

        // Output
        expiringSoon.forEach(System.out::println);
    }
}
