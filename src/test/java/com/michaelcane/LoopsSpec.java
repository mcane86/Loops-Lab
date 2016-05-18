package com.michaelcane;

import org.junit.Test;
import static org.junit.Assert.*;
public class LoopsSpec {

    Loops loops = new Loops();

    @Test
    public void testFirstLoop() {
        String expectedValue =
                "*** Output ***\n" +
                "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
        String actualValue = loops.oneToTen();
        assertEquals("Should output the needed Text", expectedValue, actualValue);
    }

    @Test
    public void testSecondLoop() {
        String expectedValue = "*** Output ***\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19\n";
        String actualValue = loops.oddNumbers();
        assertEquals("Should output the needed text", expectedValue, actualValue);
    }

    @Test
    public void testThirdLoop() {
        String expectedvalue = "*** Output ***\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100\n";
        String actualValue = loops.squares();
        assertEquals("Should out the desired text", expectedvalue, actualValue);
    }

    @Test
    public void testRandom4() {
        String expectedValue = "*** Output ***\n3\n4\n5\n6\n";
        String actualValue = loops.random4();
        assertEquals("Should output a random number", expectedValue, actualValue);
    }

    @Test
    public void testEven() {
        String expectedValue = "*** Output ***\n2\n4\n6\n8\n10\n12\n14\n16\n18\n";
        String actualValue = loops.even(20);
        assertEquals("Should output the desired text", expectedValue, actualValue);
    }

    @Test
    public void testPowers() {
        String expectedValue = "*** Output ***\n2\n4\n8\n16\n32\n64\n128\n256\n";
        String actualValue = loops.powers(8);
        assertEquals("Should output the desired text", expectedValue, actualValue);
    }

    @Test
    public void testPyramids() {
        String expectedValue = "*** Output ***\n*\n**\n***\n****\n*****";
        String actualValue = loops.pyriamids();
        assertEquals("Should output a pyramid", expectedValue, actualValue);

    }

    @Test
    public void testTableSquare() {
        String expectedValue = "*** Output ***\n| 1 | 2 | 3 | 4 |\n| 2 | 4 | 6 | 8 |\n| 3 | 6 | 9 | 12 |\n| 4 | 8 | 12 | 16 |\n";
        String actualValue = loops.tableSquare();
        assertEquals("Should output a 4x4 square", expectedValue, actualValue);
    }

    @Test
    public void testTableSquares() {
        String expectedValue = "*** Output ***\n| 1 | 2 | 3 | 4 | 5 | 6 |\n| 2 | 4 | 6 | 8 | 10 | 12 |\n| 3 | 6 | 9 | 12 | 15 | 18 |\n| 4 | 8 | 12 | 16 | 20 | 24 |\n| 5 | 10 | 15 | 20 | 25 | 30 |\n| 6 | 12 | 18 | 24 | 30 | 36 |\n";
        String actualvalue = loops.tableSquares(4);
        assertEquals("Should output a 6x6 square", expectedValue, actualvalue);
    }













}
