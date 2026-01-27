package com.DealTracker;
import java.io.*;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

public class DealTracker {

    public static void main(String[] args) throws Exception {

        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();
        List<Deal> dealList = new ArrayList<>();

        FileInputStream fis = new FileInputStream("deals.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        String code = null, date = null;
        int discount = 0, minPurchase = 0;

        while ((line = br.readLine()) != null) {

            if (line.startsWith("DealCode"))
                code = extract("DealCode: (.*)", line);

            if (line.startsWith("ValidTill"))
                date = extract("ValidTill: (.*)", line);

            if (line.startsWith("Discount"))
                discount = Integer.parseInt(
                        extract("Discount: (\\d+)%", line));

            if (line.startsWith("MinimumPurchase"))
                minPurchase = Integer.parseInt(
                        extract("MinimumPurchase: (\\d+)", line));

            // Blank line = one deal finished
            if (line.trim().isEmpty()) {
                processDeal(code, date, discount,
                            minPurchase,
                            dealMap, dealCodes, dealList);
            }
        }

        // Process last deal
        processDeal(code, date, discount,
                    minPurchase,
                    dealMap, dealCodes, dealList);

        br.close();

        // Sort by discount
        dealList.sort((a, b) -> b.discount - a.discount);

        // Display valid deals
        System.out.println("\nValid Deals:");
        for (Deal d : dealList) {
            System.out.println(d.code + " -> " +
                               d.discount + "%");
        }
    }

    // Process one deal
    private static void processDeal(String code,
                                    String date,
                                    int discount,
                                    int minPurchase,
                                    Map<String, Deal> map,
                                    Set<String> set,
                                    List<Deal> list) {

        if (code == null) return;

        if (set.contains(code)) return; // duplicate

        if (isExpired(date)) return;    // expired

        Deal deal = new Deal(code, date,
                             discount, minPurchase);

        set.add(code);
        map.put(code, deal);
        list.add(deal);
    }

    // Regex extractor
    private static String extract(String regex,
                                  String text) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        return m.find() ? m.group(1) : "";
    }

    // Regex + LocalDate
    private static boolean isExpired(String date) {
        String regex = "\\d{2}-\\d{2}-\\d{4}";
        if (!Pattern.matches(regex, date))
            return true;

        LocalDate exp =
            LocalDate.parse(date,
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        return exp.isBefore(LocalDate.now());
    }
}
