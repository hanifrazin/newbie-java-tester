package com.newbiejavatester.chap03.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameClass {
    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2 + 2;
        assertEquals("2+2=4",4, answer);
    }

    @Test
    public void canSubtractTwoMinusTwo(){
        int answer = 2 - 2;
        assertEquals("2 - 2 = 0",0,answer);
    }

    @Test
    public void canDivideFourDivTwo(){
        int jawaban = 4 / 2;
        assertEquals("4 / 2", 2, jawaban);
    }

    @Test
    public void canMultiplyTwoWithTwo(){
        int jawaban = 2 * 2;
        assertEquals("2 * 2", 4, jawaban);
    }
}
