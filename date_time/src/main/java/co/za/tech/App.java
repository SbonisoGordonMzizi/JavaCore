package co.za.tech;

 import java.util.ArrayList;

public class App {
    private  Integer numberOfEntries = 0;
    private int[] board;
    public App(Integer size){
        this.board = new int[size];
    }
    public void addScore(Integer score){

    }
    public void getBoardScore(){
        Integer count = 1;
        for(Integer index = 0; index < this.board.length; index++) {
            System.out.println(" "+count+"   :   "+this.board[index]);
            count++;
        }
    }

    public static void main(String[] args){
        App app = new App(10);
//        app.addScore(10);
//        app.addScore(101);
//        app.addScore(19);
//        app.addScore(27);
//        app.addScore(200);
//        app.addScore(15);
//        app.addScore(6);
//        app.addScore(65);
//        app.addScore(79);
//        app.addScore(178);
//        app.addScore(39);
//        app.addScore(20);
        app.getBoardScore();
    }

}
