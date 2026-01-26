package com.JUnit.exceptionTesting;
import static org.junit.Assert.*;

import org.junit.*;

public class MathUtilsTest {

    @Test
   public  void testDivideByZeroThrowsException() {

        ArithmeticException exception = assertThrows(
                ArithmeticException.class,
                () -> MathUtils.divide(10, 0)
        );

        // verify exception message
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

    @Test
    public void testDivideSuccess() {
        assertEquals(5, MathUtils.divide(10, 2));
    }
}