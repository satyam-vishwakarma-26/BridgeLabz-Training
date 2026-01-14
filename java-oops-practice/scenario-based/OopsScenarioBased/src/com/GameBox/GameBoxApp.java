package com.GameBox;
// Test class for GameBox platform
public class GameBoxApp{
    public static void main(String[] args){
        Game arcade=new ArcadeGame("SpeedRush",100,4.5);
        Game strategy=new StrategyGame("WarPlan",200,4.8);
        arcade.playDemo();
        strategy.playDemo();
        arcade.applyOffer(0.20);
        strategy.applyOffer(0.10);
        User user=new User("Satyam");
        user.buyGame(arcade);
        user.buyGame(strategy);
        arcade.download();
        strategy.download();
        user.showLibrary();
    }
}
