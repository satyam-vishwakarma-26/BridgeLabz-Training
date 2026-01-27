package com.FeedbackGuru;
class Feedback<T> {
    T type;          // Product / Service
    String message;  // feedback text
    int rating;

    public Feedback(T type, String message, int rating) {
        this.type = type;
        this.message = message;
        this.rating = rating;
    }
}
