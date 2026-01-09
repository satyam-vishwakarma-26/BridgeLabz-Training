package com.Artify;
public abstract class Artwork implements IPurchasable{

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType; //protected (encapsulation)

    //constructor without preview
    public Artwork(String title,String artist,double price,String licenseType){
        this.title=title;
        this.artist=artist;
        this.price=price;
        this.licenseType=licenseType;
    }

    //method which shows the artwork 
    public void showArtwork(){
        System.out.println("\nTitle       : "+title);
        System.out.println("Artist      : "+artist);
        System.out.println("Price       : ₹"+price);
        System.out.println("License     : "+licenseType);
    }
}
