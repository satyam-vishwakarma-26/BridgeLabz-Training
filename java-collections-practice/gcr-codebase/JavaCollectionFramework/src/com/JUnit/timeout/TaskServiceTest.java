package com.JUnit.timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TaskServiceTest {

    @Test
    @Timeout(2) // seconds
    void testLongRunningTaskTimeout() throws InterruptedException {
        TaskService.longRunningTask();
    }
}