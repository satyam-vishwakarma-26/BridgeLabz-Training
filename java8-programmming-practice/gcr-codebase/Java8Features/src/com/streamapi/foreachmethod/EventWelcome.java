package com.streamapi.foreachmethod;
import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Aarav",
            "Neha",
            "Rohit",
            "Priya",
            "Kunal"
        );

        // Print welcome message for each attendee
        attendees.forEach(attendee ->
            System.out.println("Welcome to the event, " + attendee + "!")
        );
    }
}
