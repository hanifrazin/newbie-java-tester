package com.newbiejavatester.chap04.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){
        Integer five = 5;
        assertEquals("intValue returns int 5",5,five.intValue());
    }

    @Test
    public void convertIntegerToHex() {
        String eleven = Integer.toHexString(11);
        assertEquals("11 becomes b", "b", eleven);

        String ten = Integer.toHexString(10);
        assertEquals("10 becomes a", "a", ten);

        String three = Integer.toHexString(3);
        assertEquals("3 becomes 3", "3", three);

        String twenty1 = Integer.toHexString(21);
        assertEquals("21 becomes 15","15",twenty1);
    }

    @Test
    public void confirmMaxMinIntegerSize(){
        String MinValue = String.valueOf(Integer.MIN_VALUE);
        assertEquals("MIN_VALUE equals -2147483648","-2147483648",MinValue);

        String MaxValue = String.valueOf(Integer.MAX_VALUE);
        assertEquals("MAX_VALUE equals 2147483647","2147483647",MaxValue);
    }

    @Test
    public void differentIntegerAndInt(){
        Integer firstFour = 4;
        Integer secondFour = 4;
        assertEquals("Assertion 1 : ",firstFour,secondFour);
        assertTrue("Assertion compare 2 : ",firstFour == secondFour);
        assertTrue("Assertion compare 3 : ",firstFour.equals(secondFour));
    }
}
