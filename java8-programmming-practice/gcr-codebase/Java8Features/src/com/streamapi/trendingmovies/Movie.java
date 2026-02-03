package com.streamapi.trendingmovies;
class Movie {
    String title;
    double rating;
    int releaseYear;

    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " | Rating: " + rating + " | Year: " + releaseYear;
    }
}
