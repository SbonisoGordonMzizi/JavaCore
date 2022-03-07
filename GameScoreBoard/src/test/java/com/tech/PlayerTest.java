package com.tech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getScore() {
        int score = 10;
        String playName = "Vice";
        Player player = new Player(score,playName);
        assertEquals(10,player.getScore());
    }

    @Test
    void getPlayName() {
        int score = 10;
        String playName = "Vice";
        Player player = new Player(score,playName);
        assertEquals("Vice",player.getPlayName());

    }

    @Test
    void testToString() {
        int score = 10;
        String playName = "Vice";
        Player player = new Player(score,playName);
        assertEquals("Name: Vice, Score: 10",player.toString());

    }
}