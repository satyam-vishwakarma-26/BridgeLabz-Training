package com.MedInventory;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class MedInventory {

    public static void main(String[] args) {

        Set<Item<String>> itemSet = new HashSet<>();
        Map<String, List<Item<String>>> categoryMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("inventory.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int qty = Integer.parseInt(parts[2]);
                    String date = parts[3];

                    if (isExpired(date))
                        System.out.println("Expired item: " + name);

                    if (qty < 3)
                        throw new LowStockException("Critical low stock: " + name);

                    Item<String> item =
                            new Item<>(id, name, qty, date);

                    itemSet.add(item);

                    categoryMap
                        .computeIfAbsent(name, k -> new ArrayList<>())
                        .add(item);

                } catch (LowStockException e) {
                    System.out.println(e.getMessage());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // Display unique items
        System.out.println("\nUnique Inventory:");
        for (Item<String> i : itemSet) {
            System.out.println(i.id + " " + i.name + " " + i.quantity);
        }

        // Display categories
        System.out.println("\nCategorized Inventory:");
        categoryMap.forEach((k, v) -> {
            System.out.println(k + " -> " + v.size());
        });
    }

    // Regex + date check
    private static boolean isExpired(String date) {
        String regex = "\\d{2}-\\d{2}-\\d{4}";
        if (!Pattern.matches(regex, date))
            return false;

        LocalDate exp =
            LocalDate.parse(date, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        return exp.isBefore(LocalDate.now());
    }
}
