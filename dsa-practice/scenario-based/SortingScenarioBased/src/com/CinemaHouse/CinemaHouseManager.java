package com.CinemaHouse;
import java.util.*;
// Manages movie shows and sorting
public class CinemaHouseManager{
    private ArrayList<MovieShow> shows=new ArrayList<>();
    // Add movie show
    public void addShow(String name,int time){
        shows.add(new MovieShow(name,time));
        System.out.println("Show added");
    }
    // Bubble Sort by show time (ascending)
    public void sortShows(){
        int n=shows.size();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(shows.get(j).showTime>shows.get(j+1).showTime){
                    MovieShow temp=shows.get(j);
                    shows.set(j,shows.get(j+1));
                    shows.set(j+1,temp);
                }
            }
        }
        System.out.println("Shows sorted by time");
    }
    // Display all shows
    public void displayShows(){
        if(shows.isEmpty()){
            System.out.println("No shows available");
            return;
        }
        for(MovieShow s:shows){
            s.display();
        }
    }
}
