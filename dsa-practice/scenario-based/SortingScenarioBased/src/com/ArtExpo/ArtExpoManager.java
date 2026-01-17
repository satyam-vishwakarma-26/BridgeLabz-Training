package com.ArtExpo;
import java.util.*;

// Manages artist registrations and sorting
public class ArtExpoManager{
    private ArrayList<Artist> artists=new ArrayList<>();

    // Add artist and keep list sorted
    public void registerArtist(String name,int time){
        Artist artist=new Artist(name,time);
        artists.add(artist);
        insertionSort();
        System.out.println("Artist registered and list updated");
    }
    
    // Insertion Sort by registration time
    private void insertionSort(){
        for(int i=1;i<artists.size();i++){
            Artist key=artists.get(i);
            int j=i-1;
            while(j>=0&&artists.get(j).registrationTime>key.registrationTime){
                artists.set(j+1,artists.get(j));
                j--;
            }
            artists.set(j+1,key);
        }
    }
    
    // Display all registered artists
    public void displayArtists(){
        if(artists.isEmpty()){
            System.out.println("No artists registered");
            return;
        }
        for(Artist a:artists){
            a.display();
        }
    }
}
