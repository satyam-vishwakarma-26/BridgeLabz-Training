package com.JUnit.filehandling;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileProcessorTest {

    private FileProcessor fileProcessor;
    private Path tempFile;

    @BeforeEach
    void setUp() throws IOException {
        fileProcessor = new FileProcessor();
        tempFile = Files.createTempFile("testfile", ".txt");
    }

    @AfterEach
    void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    // ✅ Test: content written and read correctly
    @Test
    void testWriteAndReadFile() throws IOException {
        String content = "Hello JUnit File Test";

        fileProcessor.writeToFile(tempFile.toString(), content);
        String result = fileProcessor.readFromFile(tempFile.toString());

        assertEquals(content, result);
    }

    // ✅ Test: file exists after writing
    @Test
    void testFileExistsAfterWrite() throws IOException {
        fileProcessor.writeToFile(tempFile.toString(), "Some content");

        assertTrue(Files.exists(tempFile),
                "File should exist after writing");
    }

    // ✅ Test: IOException when file does not exist
    @Test
    void testReadNonExistingFileThrowsException() {
        Path nonExistingFile = Path.of("no_such_file.txt");

        assertThrows(IOException.class, () ->
                fileProcessor.readFromFile(nonExistingFile.toString())
        );
    }
}