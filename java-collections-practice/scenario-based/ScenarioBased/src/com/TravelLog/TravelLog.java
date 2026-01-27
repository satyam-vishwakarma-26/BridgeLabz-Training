package com.TravelLog;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {

    static String FILE_NAME = "trips.dat";

    public static void main(String[] args) throws Exception {

        // Write sample trips
        writeTrips();

        // Read trips from file
        List<Trip> trips = readTrips();

        // All cities using regex
        System.out.println("Cities found:");
        findCities(trips);

        // Trips > 5 days
        System.out.println("\nTrips longer than 5 days:");
        for (Trip t : trips) {
            if (t.days > 5)
                System.out.println(t.city + " (" + t.days + " days)");
        }

        // Unique countries
        Set<String> countries = new HashSet<>();
        for (Trip t : trips)
            countries.add(t.country);

        System.out.println("\nUnique countries:");
        countries.forEach(System.out::println);

        // Top 3 cities
        System.out.println("\nTop 3 cities:");
        topCities(trips);
    }

    // Serialize trips
    private static void writeTrips() throws Exception {
        List<Trip> trips = new ArrayList<>();
        trips.add(new Trip("Paris", "France", 4, "Lovely city"));
        trips.add(new Trip("Rome", "Italy", 7, "Great food"));
        trips.add(new Trip("Paris", "France", 6, "Art museums"));
        trips.add(new Trip("Berlin", "Germany", 3, "History"));
        trips.add(new Trip("Rome", "Italy", 8, "Colosseum"));

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(FILE_NAME));
        oos.writeObject(trips);
        oos.close();
    }

    // Deserialize trips
    private static List<Trip> readTrips() throws Exception {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream(FILE_NAME));
        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();
        return trips;
    }

    // Regex city extraction
    private static void findCities(List<Trip> trips) {
        Pattern p = Pattern.compile("[A-Z][a-z]+");
        for (Trip t : trips) {
            Matcher m = p.matcher(t.city);
            if (m.find())
                System.out.println(m.group());
        }
    }

    // Top 3 cities
    private static void topCities(List<Trip> trips) {
        Map<String, Integer> map = new HashMap<>();

        for (Trip t : trips)
            map.put(t.city, map.getOrDefault(t.city, 0) + 1);

        map.entrySet().stream()
           .sorted((a, b) -> b.getValue() - a.getValue())
           .limit(3)
           .forEach(e ->
                System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}
