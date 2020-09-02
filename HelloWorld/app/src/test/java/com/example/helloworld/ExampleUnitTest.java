package com.example.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void concatenation_isCorrect() {assertEquals("Hello World!", "Hello" + " " + "World!");}

    @Test
    public void concatenation_isCorrect_Two() {
        String expected = "Hello World!";
        String first = "Hello";
        String second = "World";
        String third = "!";
        String result = first + " " + second + third;

        assertEquals( expected, result);
    }
}