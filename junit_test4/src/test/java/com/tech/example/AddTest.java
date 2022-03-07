package com.tech.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.*;

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

    @Test
    public void genCode(){
        Random random = Mockito.mock(java.util.Random.class);
        

    }
}