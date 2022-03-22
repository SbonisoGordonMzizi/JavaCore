package com.tech.example;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Add {
    private  final PrintStream systemOut = System.out;
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;
    private Scanner scanner ;

    public int addTwoNumbers(int number1, int number2){

        return number1 + number2;
    }

    public void HelloWord(){

        System.out.println("HELLO WORLD");
    }

    public String Ask(){
        scanner = new Scanner(System.in);
        String  name = scanner.next();
        return name;
    }

    public ArrayList<Integer> genCode(Random random){
        ArrayList<Integer> code = new ArrayList<>();
        while(code.size() != 4){
            int num = random.nextInt(8);
            if(code.contains(num) == false && num != 0) {
                code.add(num);
            }
        }
        return code;
    }
    public void readAll(){
        testIn = new ByteArrayInputStream("one\ntwo\nthree\n".getBytes());
        System.setIn(testIn);
        System.out.println(Ask());
        System.out.println(Ask());

    }

    public static void main(String[] args) {
        Add add = new Add();
        add.readAll();
    }
}
