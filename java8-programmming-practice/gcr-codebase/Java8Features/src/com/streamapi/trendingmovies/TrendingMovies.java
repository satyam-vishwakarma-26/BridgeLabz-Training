package com.streamapi.trendingmovies;
import java.util.*;
import java.util.stream.Collectors;

public class TrendingMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.9, 2024),
            new Movie("Movie B", 7.5, 2019),
            new Movie("Movie C", 9.1, 2023),
            new Movie("Movie D", 8.7, 2022),
            new Movie("Movie E", 9.0, 2021),
            new Movie("Movie F", 8.8, 2020),
            new Movie("Movie G", 9.3, 2024)
        );

        List<Movie> top5Trending = movies.stream()

            // 1️ Filter movies released from 2020 onwards
            .filter(movie -> movie.releaseYear >= 2020)

            // 2️ Sort by rating DESC, then release year DESC
            .sorted(Comparator
                    .comparingDouble((Movie m) -> m.rating).reversed()
                    .thenComparingInt(m -> m.releaseYear).reversed())

            // 3️ Limit to top 5
            .limit(5)

            // Collect result
            .collect(Collectors.toList());

        // Output
        top5Trending.forEach(System.out::println);
    }
}
