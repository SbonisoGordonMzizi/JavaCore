package com.tech;

public class Player {
    private int score;
    private String playName;

    public Player(int score ,String playName){
        this.score = score;
        this.playName = playName;
    }

    public int getScore(){
        return  this.score;
    }

    public String getPlayName(){
        return  this.playName;
    }

    @Override
    public String toString() {
       return "Name: "+this.playName+", Score: "+this.score;
    }
}
