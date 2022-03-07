package com.tech;

import java.util.Arrays;

public class GameScoreBoard {

    private Player[] playerScore;
    private  int numberOfEntries = 0;
    public GameScoreBoard(){
        this.playerScore = new Player[10];
    }
    public GameScoreBoard(int scoreBoardSize){
        this.playerScore = new Player[scoreBoardSize];
    }

    public void add(){

    }

    @Override
    public String toString(){
        return  "";
    }

}
