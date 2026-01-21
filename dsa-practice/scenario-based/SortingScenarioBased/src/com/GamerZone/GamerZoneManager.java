package com.GamerZone;
import java.util.*;

// Manages players and quick sort logic
public class GamerZoneManager{
    private ArrayList<Player> players=new ArrayList<>();

    // Add player score
    public void addPlayer(String name,int score){
        players.add(new Player(name,score));
        System.out.println("Player added");
    }
    
    // Sort players by score using quick sort
    public void sortLeaderboard(){
        if(players.size()>1){
            quickSort(0,players.size()-1);
            System.out.println("Leaderboard updated");
        }
    }
    
    // Quick sort recursive method
    private void quickSort(int low,int high){
        if(low<high){
            int pivotIndex=partition(low,high);
            quickSort(low,pivotIndex-1);
            quickSort(pivotIndex+1,high);
        }
    }
    
    // Partition logic (higher score first)
    private int partition(int low,int high){
        int pivot=players.get(high).score;
        int i=low-1;
        for(int j=low;j<high;j++){
            if(players.get(j).score>=pivot){
                i++;
                Player temp=players.get(i);
                players.set(i,players.get(j));
                players.set(j,temp);
            }
        }
        Player temp=players.get(i+1);
        players.set(i+1,players.get(high));
        players.set(high,temp);
        return i+1;
    }
    
    // Display leaderboard
    public void displayLeaderboard(){
        if(players.isEmpty()){
            System.out.println("No players available");
            return;
        }
        int rank=1;
        for(Player p:players){
            System.out.print("Rank "+rank+": ");
            p.display();
            rank++;
        }
    }
}
