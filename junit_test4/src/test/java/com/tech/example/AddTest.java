package com.tech.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class AddTest {
    private  final PrintStream  systemOut = System.out;
    private final InputStream systemIn = System.in;
    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    @Test
    public void addTwoNumbers2and2() {
        //Arrange
        Add add = new Add();
        //Act
        int answer = add.addTwoNumbers(2,2);
        //Assert
        assertEquals(4,answer);
    }

    @Test
    public void HelloWord(){
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));

        Add add = new Add();
        add.HelloWord();
        assertEquals("HELLO WORLD",testOut.toString().trim());

    }

    @Test
    public void Ask(){
        String data = "Vice";
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
        Add add =  new Add();
        String h = add.Ask();
        assertEquals("Vice",h);

    }

//    @Test
//    public void genCode(){
//        class MyRandom extends Random{
//            private int rand = 0;
//
//            @Override
//            public int nextInt(int bound){
//                this.rand++;
//                return this.rand;
//            }
//
//        }
//
//        MyRandom random = new MyRandom();
//        Add add = new Add();
//        ArrayList<Integer> expectedCode = new ArrayList<>();
//        expectedCode.add(2);
//        expectedCode.add(3);
//        expectedCode.add(4);
//        expectedCode.add(5);
//        ArrayList<Integer> actualCode = add.genCode(random);
//        assertEquals(expectedCode,actualCode);
//        assertEquals(4,actualCode.size());
//
//    }

    @Test
    public void genCodeTest(){
        ArrayList<Integer> expectedCode = new ArrayList<>();
        expectedCode.add(1);
        expectedCode.add(2);
        expectedCode.add(3);
        expectedCode.add(4);
        Random mockedRandom = Mockito.mock(Random.class);
        when(mockedRandom.nextInt(anyInt())).thenReturn(1,2,3,4);

        Add add = new Add();
        ArrayList<Integer> h = add.genCode(mockedRandom);
        System.out.println(h);
        assertEquals(expectedCode,h);
    }
}