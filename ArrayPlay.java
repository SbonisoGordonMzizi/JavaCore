package com.tech;

public class ArrayPlay{
    private int numberOfEntries = 0;
    private int[] highScoreBoard;

    public ArrayPlay(int size){
        this.highScoreBoard = new int[size];
    }

    public void addHighScore(int highScore){
        if(numberOfEntries < this.highScoreBoard.length || highScore > highScoreBoard[numberOfEntries-1]){
            if(numberOfEntries < this.highScoreBoard.length){
                numberOfEntries++;
            }
            //get the index of left element
            int leftElemenIndex = numberOfEntries-1;
            //check if left index is greater than zero and last score in highScoreBoard is less than newScore
            while(leftElemenIndex > 0 && highScoreBoard[leftElemenIndex-1] < highScore){
                highScoreBoard[leftElemenIndex] = highScoreBoard[leftElemenIndex-1]; //shift right low Score
                leftElemenIndex--; // decrement left index
            }
            highScoreBoard[leftElemenIndex]=highScore; //add new score in the right left index or position
        }
    }

    public void getScoreBoard(){
        for(int element : this.highScoreBoard){
            System.out.println(element);
        }
    }

    public static void main(String... args){
        ArrayPlay arrayPlay = new ArrayPlay(10);
        arrayPlay.addHighScore(10);
        arrayPlay.addHighScore(13);
        arrayPlay.addHighScore(17);
        arrayPlay.addHighScore(9);
        arrayPlay.addHighScore(100);
        arrayPlay.addHighScore(12);
        arrayPlay.addHighScore(1);
        arrayPlay.addHighScore(16);
        arrayPlay.addHighScore(94);
        arrayPlay.addHighScore(150);
        arrayPlay.addHighScore(111);
        arrayPlay.addHighScore(140);


        arrayPlay.getScoreBoard();
    }
}