package com.workshop.servicemanagementsystem;
import java.util.*;
import java.util.stream.*;

public class SmartCitySystem {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
            new BusService("A-B", 20, 480, true),
            new MetroService("A-C", 30, 450, false),
            new TaxiService("B-C", 50, 500, true),
            new AmbulanceService()
        );

        /* 1. Lambda Expressions – filter & sort */
        List<TransportService> filteredServices =
            services.stream()
                    .filter(s -> s.getFare() <= 40)
                    .sorted(Comparator.comparingInt(TransportService::getDepartureTime))
                    .collect(Collectors.toList());

        /* 2. Method Reference + 6. forEach() */
        filteredServices.forEach(TransportService::printServiceDetails);

        /* 5. Stream API + 7. Collectors */
        List<PassengerTrip> trips = Arrays.asList(
            new PassengerTrip("A-B", 20, true),
            new PassengerTrip("A-B", 22, false),
            new PassengerTrip("A-C", 30, false),
            new PassengerTrip("B-C", 50, true)
        );

        // Group by route
        Map<String, List<PassengerTrip>> byRoute =
            trips.stream().collect(Collectors.groupingBy(t -> t.route));

        // Partition peak vs non-peak
        Map<Boolean, List<PassengerTrip>> peakPartition =
            trips.stream().collect(Collectors.partitioningBy(t -> t.peak));

        // Fare summary
        DoubleSummaryStatistics fareStats =
            trips.stream()
                 .collect(Collectors.summarizingDouble(t -> t.fare));

        System.out.println("\nRevenue Summary:");
        System.out.println("Total Revenue: " + fareStats.getSum());
        System.out.println("Average Fare: " + fareStats.getAverage());

        /* 9. Functional Interface with Lambda */
        FareCalculator calculator =
            (distance, peak) -> peak ? distance * 15 : distance * 10;

        System.out.println("\nCalculated Fare: " +
            calculator.calculateFare(5, true));

        /* 10. Marker Interface Detection */
        System.out.println("\nEmergency Priority Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println(s.getServiceName()));
    }
}
