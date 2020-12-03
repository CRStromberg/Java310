package com.example.kattis;

import junit.framework.TestCase;

import java.io.Console;
import java.io.IOException;

public class wordsTest extends TestCase {

    public void testMain() {
        //Can't figure out how to test these lines
        // the program just loops

        /*
        String[] args = null;
        words word = new words();
        try {
            word.main(args);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }


    public void testParse() {
        String dataOne = "Here is 1 test";
        String dataTwo = "35 dollars";

        words word = new words();
       words.parse(dataOne);
       words.parse(dataTwo);

    }

    public void testTrans() {
        String[] ans = {"one", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "ninety-two"};
        int[] testNum = {1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 92};
        String given;
        words word = new words();
        for(int i = 0; i < 12; i ++) {
            given = words.trans(testNum[i]);
            assertEquals(given, ans[i]);
        }

    }

    public void testToTens() {
        words word = new words();
        String[] exp = {"zero", "teen", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String ans;
        int i;

        for(i = 0; i < 10; i++) {
            ans = words.toTens(i);
            assertEquals(exp[i], ans);
        }
    }

    public void testToOnes() {
        words word = new words();
        String[] exp = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String ans;
        int i;

        for(i = 0; i < 10; i++) {
            ans = words.toOnes(i);
           assertEquals(exp[i], ans);
        }
    }
}