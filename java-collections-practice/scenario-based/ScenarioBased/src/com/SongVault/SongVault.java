package com.SongVault;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVault {

    public static void main(String[] args) {

        File folder = new File("songs");
        List<Song> songList = new ArrayList<>();
        Map<String, List<Song>> genreMap = new HashMap<>();
        Set<String> artists = new HashSet<>();

        // Read all song files
        for (File file : folder.listFiles()) {
            try {
                Song song = readSong(file);
                songList.add(song);
                artists.add(song.artist);

                genreMap
                    .computeIfAbsent(song.genre, k -> new ArrayList<>())
                    .add(song);

            } catch (Exception e) {
                System.out.println("Skipping file: " + file.getName());
            }
        }

        // Display unique artists
        System.out.println("Unique Artists:");
        artists.forEach(System.out::println);

        // Display grouped by genre
        System.out.println("\nSongs by Genre:");
        genreMap.forEach((k, v) -> {
            System.out.println("\n" + k + ":");
            v.forEach(s -> System.out.println(s.title));
        });

        // Filter Rock songs
        System.out.println("\nRock Songs:");
        songList.stream()
                .filter(s -> s.genre.equalsIgnoreCase("Rock"))
                .forEach(s -> System.out.println(s.title));

        // Sort by title
        System.out.println("\nSorted Songs:");
        songList.stream()
                .sorted(Comparator.comparing(s -> s.title))
                .forEach(s -> System.out.println(s.title));
    }

    // Read and parse song file
    private static Song readSong(File file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String content = br.lines().collect(Collectors.joining("\n"));
        br.close();

        String title = extract("Title: (.*)", content);
        String artist = extract("Artist: (.*)", content);
        String duration = extract("Duration: (.*)", content);
        String genre = extract("Genre: (.*)", content);

        return new Song(title, artist, duration, genre);
    }

    // Regex extractor
    private static String extract(String regex, String text) throws Exception {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        if (m.find())
            return m.group(1);
        else
            throw new Exception("Field not found");
    }
}
