package com.streamapi.hospitaldoctor;
import java.util.*;

public class HospitalAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Adams", "Neurology", false),
            new Doctor("Dr. Clark", "Orthopedics", true),
            new Doctor("Dr. Brown", "Dermatology", true),
            new Doctor("Dr. Wilson", "Neurology", true)
        );

        doctors.stream()

            // 1️⃣ Filter doctors available on weekends
            .filter(doctor -> doctor.availableOnWeekend)

            // 2️⃣ Sort by specialty
            .sorted(Comparator.comparing(doctor -> doctor.specialty))

            // Output result
            .forEach(System.out::println);
    }
}
