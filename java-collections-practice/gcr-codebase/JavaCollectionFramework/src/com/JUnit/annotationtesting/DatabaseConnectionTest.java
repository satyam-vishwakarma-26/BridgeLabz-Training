package com.JUnit.annotationtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    private DatabaseConnection dbConnection;

    // Runs BEFORE each test
    @BeforeEach
   public  void setUp() {
        dbConnection = new DatabaseConnection();
        dbConnection.connect();
    }

    // Runs AFTER each test
    @AfterEach
    public void tearDown() {
        dbConnection.disconnect();
    }

    @Test
    public void testDatabaseIsConnected() {
        assertTrue(dbConnection.isConnected(),
                "Database should be connected before test");
    }

    @Test
    public void testDatabaseIsDisconnectedAfterTest() {
        assertTrue(dbConnection.isConnected());

        dbConnection.disconnect();

        assertFalse(dbConnection.isConnected(),
                "Database should be disconnected");
    }
}