package com.streamapi.foreachmethod;
import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
            1450.50,
            1462.75,
            1458.30,
            1470.90,
            1465.40
        );

        // Display stock price updates
        stockPrices.forEach(price ->
            System.out.println("Stock Price Update: ₹" + price)
        );
    }
}
