package com.tech.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Add {
    public int addTwoNumbers(int number1, int number2){
        return number1 + number2;
    }

    public void HelloWord(){
        System.out.println("HELLO WORLD");
    }

    public String Ask(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public ArrayList<Integer> genCode(){
        ArrayList<Integer> code = new ArrayList<>();
        Random random = new Random(); // collaborator 1
        while(code.size() != 4){
            int num = random.nextInt(8-1) + 1;
            if(code.contains(num) == false) {
                code.add(num);
            }
        }
        return code;
    }

    public static void main(String[] args) {
        Add add = new Add();
        System.out.println(add.genCode());
    }
}
