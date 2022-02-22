package com.tech;

public class Insertion_sort {
    private int[] highScoreBoard = {10,100,50,34,9,150,122,34,56,90,81};
    
    public void sortHighScoreBoard(){
        int HighScoreBoard = this.highScoreBoard.length;
        for(int index = 1; index < HighScoreBoard; index++){
           int current_element = this.highScoreBoard[index];
           int left_index = index;
           while(left_index > 0 && this.highScoreBoard[left_index-1] < current_element){
               highScoreBoard[left_index] = highScoreBoard[left_index-1];
               left_index--; 
           }
           highScoreBoard[left_index] = current_element;
        }
        
    }

    public void getScoreBoard(){
        for(int element: this.highScoreBoard){
            System.out.println(element);    
        }
    }

    public static void main(String... args){
       Insertion_sort data = new Insertion_sort();
       data.sortHighScoreBoard();
       data.getScoreBoard();
    }
}
