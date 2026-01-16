package com.CinemaHouse;
// Represents a movie show with time
public class MovieShow{
    String movieName;
    int showTime;
    public MovieShow(String movieName,int showTime){
        this.movieName=movieName;
        this.showTime=showTime;
    }
    // Display show details
    public void display(){
        System.out.println(movieName+" | Time: "+showTime);
    }
}
