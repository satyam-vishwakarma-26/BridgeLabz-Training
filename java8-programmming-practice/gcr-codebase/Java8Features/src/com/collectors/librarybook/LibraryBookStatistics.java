package com.collectors.librarybook;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {

    public static void main(String[] args) {

        List<Book> books = List.of(
            new Book("The Hobbit", "Fantasy", 310),
            new Book("Harry Potter", "Fantasy", 450),
            new Book("Clean Code", "Technology", 464),
            new Book("Effective Java", "Technology", 416),
            new Book("The Alchemist", "Fiction", 197)
        );

        // Summarize pages per genre
        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                     .collect(Collectors.groupingBy(
                             Book::getGenre,
                             Collectors.summarizingInt(Book::getPages)
                     ));

        // Print statistics
        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total Pages   : " + stats.getSum());
            System.out.println("  Average Pages : " + stats.getAverage());
            System.out.println("  Max Pages     : " + stats.getMax());
            System.out.println();
        });
    }
}
