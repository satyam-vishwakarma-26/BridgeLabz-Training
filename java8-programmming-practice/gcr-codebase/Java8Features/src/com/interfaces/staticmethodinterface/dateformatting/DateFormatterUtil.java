package com.interfaces.staticmethodinterface.dateformatting;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateFormatterUtil {

    static String formatDate(LocalDate date, String pattern) {
        if (date == null || pattern == null) {
            throw new IllegalArgumentException("Date and pattern must not be null");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}