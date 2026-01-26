package com.JUnit.stringutilitymethods;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {

    // reverse() tests
    @Test
   public void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    public void testReverseEmptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    // isPalindrome() tests
    @Test
    public void testPalindromeTrue() {
        assertTrue(StringUtils.isPalindrome("madam"));
    }

    @Test
    public void testPalindromeFalse() {
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    // toUpperCase() tests
    @Test
    public void testToUpperCase() {
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
    }

    @Test
    public void testToUpperCaseMixed() {
        assertEquals("HELLO WORLD", StringUtils.toUpperCase("Hello World"));
    }
}