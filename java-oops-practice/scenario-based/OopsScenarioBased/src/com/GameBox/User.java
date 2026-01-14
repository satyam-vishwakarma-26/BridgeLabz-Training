package com.GameBox;
import java.util.*;
// Represents a user in GameBox
public class User{
    private String name;
    private List<Game> ownedGames=new ArrayList<>();
    public User(String name){
        this.name=name;
    }
    // Add game securely to user library
    public void buyGame(Game game){
        ownedGames.add(game);
        System.out.println(name+" purchased "+game.title);
    }
    // Display owned games
    public void showLibrary(){
        System.out.println(name+"'s Game Library:");
        for(Game g:ownedGames){
            System.out.println(g.title+" | "+g.genre+" | Rating: "+g.rating);
        }
    }
}
