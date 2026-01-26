package com.JUnit.parameterizedtest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumberUtilsTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {

        if (number % 2 == 0) {
            assertTrue(NumberUtils.isEven(number),
                    number + " should be even");
        } else {
            assertFalse(NumberUtils.isEven(number),
                    number + " should be odd");
        }
    }
}