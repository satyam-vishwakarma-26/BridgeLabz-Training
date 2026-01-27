package com.SongVault;
class Media<T> {
    T title;
    String artist;
    String duration;
    String genre;

    public Media(T title, String artist, String duration, String genre) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
    }
}
