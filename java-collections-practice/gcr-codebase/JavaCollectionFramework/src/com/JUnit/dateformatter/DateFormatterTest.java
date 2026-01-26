package com.JUnit.dateformatter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateFormatterTest {

    private DateFormatter formatter;

    @BeforeEach
    void setUp() {
        formatter = new DateFormatter();
    }

    // Valid date
    @Test
    void testValidDate() {
        assertEquals("25-01-2026", formatter.formatDate("2026-01-25"));
    }

    // Invalid format
    @Test
    void testInvalidFormat() {
        assertThrows(
                IllegalArgumentException.class,
                () -> formatter.formatDate("25-01-2026")
        );
    }

    // Invalid date value
    @Test
    void testInvalidDateValue() {
        assertThrows(
                IllegalArgumentException.class,
                () -> formatter.formatDate("2024-13-40")
        );
    }

    // Null input
    @Test
    void testNullInput() {
        assertThrows(
                IllegalArgumentException.class,
                () -> formatter.formatDate(null)
        );
    }
}