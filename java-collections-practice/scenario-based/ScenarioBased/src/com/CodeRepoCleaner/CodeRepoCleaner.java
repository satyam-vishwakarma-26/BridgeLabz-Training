package com.CodeRepoCleaner;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class CodeRepoCleaner {

    static Map<FileType, List<File>> fileMap = new HashMap<>();

    public static void main(String[] args) throws Exception {

        Path root = Paths.get("coderepo");

        fileMap.put(FileType.VALID, new ArrayList<>());
        fileMap.put(FileType.WARNING, new ArrayList<>());
        fileMap.put(FileType.ERROR, new ArrayList<>());

        // Scan all .java files
        List<Path> javaFiles = Files.walk(root)
                .filter(p -> p.toString().endsWith(".java"))
                .collect(Collectors.toList());

        for (Path p : javaFiles) {
            analyzeFile(p.toFile());
        }

        // Organize files
        organizeFiles();

        // Filter large files (>5KB)
        System.out.println("\nLarge files (>5KB):");
        javaFiles.stream()
                .filter(p -> p.toFile().length() > 5000)
                .forEach(System.out::println);
    }

    // Analyze single file
    private static void analyzeFile(File file) {
        try {
            String content = Files.readString(file.toPath());

            boolean badMethod = hasBadMethodName(content);
            boolean unusedImport = hasUnusedImport(content);

            if (badMethod)
                fileMap.get(FileType.ERROR).add(file);
            else if (unusedImport)
                fileMap.get(FileType.WARNING).add(file);
            else
                fileMap.get(FileType.VALID).add(file);

        } catch (Exception e) {
            fileMap.get(FileType.ERROR).add(file);
        }
    }

    // Regex: method naming
    private static boolean hasBadMethodName(String text) {
        Pattern p = Pattern.compile("void [A-Z].*\\(");
        return p.matcher(text).find();
    }

    // Regex: unused import (simple)
    private static boolean hasUnusedImport(String text) {
        Pattern p = Pattern.compile("import .*;");
        Matcher m = p.matcher(text);
        while (m.find()) {
            String imp = m.group().replace("import", "")
                                  .replace(";", "").trim();
            if (!text.contains(imp.substring(imp.lastIndexOf(".") + 1)))
                return true;
        }
        return false;
    }

    // Move files to folders
    private static void organizeFiles() throws Exception {
        Files.createDirectories(Paths.get("Valid"));
        Files.createDirectories(Paths.get("Warnings"));
        Files.createDirectories(Paths.get("Errors"));

        moveFiles(FileType.VALID, "Valid");
        moveFiles(FileType.WARNING, "Warnings");
        moveFiles(FileType.ERROR, "Errors");
    }

    private static void moveFiles(FileType type, String folder) throws Exception {
        for (File f : fileMap.get(type)) {
            Files.copy(f.toPath(),
                    Paths.get(folder + "/" + f.getName()),
                    StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
