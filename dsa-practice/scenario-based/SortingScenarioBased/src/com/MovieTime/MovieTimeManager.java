package com.MovieTime;
import java.util.*;

// Manages movie shows and insertion sort
public class MovieTimeManager{
    private ArrayList<MovieShow> shows=new ArrayList<>();

    // Add show and keep list sorted by time
    public void addShow(String name,int time){
        MovieShow show=new MovieShow(name,time);
        shows.add(show);
        insertionSort();
        System.out.println("Show added and list updated");
    }
    
    // Insertion Sort by show time
    private void insertionSort(){
        for(int i=1;i<shows.size();i++){
            MovieShow key=shows.get(i);
            int j=i-1;
            while(j>=0&&shows.get(j).showTime>key.showTime){
                shows.set(j+1,shows.get(j));
                j--;
            }
            shows.set(j+1,key);
        }
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
