package com.GameBox;
// Base class for all games
public abstract class Game implements IDownloadable{
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;
    protected Game(String title,String genre,double price,double rating){
        this.title=title;
        this.genre=genre;
        this.price=price;
        this.rating=rating;
    }
    // Apply seasonal discount using operator
    public void applyOffer(double discount){
        price=price-(price*discount);
    }
    // Download game
    public void download(){
        System.out.println(title+" downloaded");
    }
}
