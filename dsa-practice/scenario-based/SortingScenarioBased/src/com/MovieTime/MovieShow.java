package com.MovieTime;

// Represents a movie show
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
