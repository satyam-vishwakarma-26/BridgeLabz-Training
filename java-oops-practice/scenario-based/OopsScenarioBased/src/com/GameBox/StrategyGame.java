package com.GameBox;
// Strategy game type
public class StrategyGame extends Game{
    public StrategyGame(String title,double price,double rating){
        super(title,"Strategy",price,rating);
    }
    // Demo behavior for strategy game
    public void playDemo(){
        System.out.println(title+" demo: Tactical planning mission");
    }
}
