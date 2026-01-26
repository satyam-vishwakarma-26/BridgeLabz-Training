package com.JUnit.registration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    private UserRegistration registration;

    @BeforeEach
    void setUp() {
        registration = new UserRegistration();
    }

    // Valid registration
    @Test
    void testValidUserRegistration() {
        assertTrue( registration.registerUser(
                        "johnDoe",
                        "john@example.com",
                        "password123"));
    }

    // Invalid username
    @Test
    void testInvalidUsername() {
        assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser(
                        "jo",
                        "john@example.com",
                        "password123"));
    }

    // Invalid email
    @Test
    void testInvalidEmail() {
        assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser(
                        "johnDoe",
                        "johnexample.com",
                        "password123")
        );
    }

    // Invalid password
    @Test
    void testInvalidPassword() {
        assertThrows(
                IllegalArgumentException.class,
                () -> registration.registerUser(
                        "johnDoe",
                        "john@example.com",
                        "pass")
        );
    }

    // Null values
    @Test
    void testNullInputs() {
        assertThrows( IllegalArgumentException.class, () -> registration.registerUser(null, null, null));
    }
}
