package com.GamerZone;

// Represents a player in the game
public class Player{
    String playerName;
    int score;
    public Player(String playerName,int score){
        this.playerName=playerName;
        this.score=score;
    }

    // Display player details
    public void display(){
        System.out.println(playerName+" | Score: "+score);
    }
}
