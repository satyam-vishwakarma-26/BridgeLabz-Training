package com.GameBox;
// Arcade game type
public class ArcadeGame extends Game{
    public ArcadeGame(String title,double price,double rating){
        super(title,"Arcade",price,rating);
    }
    // Demo behavior for arcade game
    public void playDemo(){
        System.out.println(title+" demo: Fast-paced arcade action");
    }
}
