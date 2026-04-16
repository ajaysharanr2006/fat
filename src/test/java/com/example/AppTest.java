package com.example;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testMultiply() {
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{2, 0}, {1, 2}};
        int[][] expected = {{4, 4}, {10, 8}};
        assertArrayEquals(expected, App.multiply(A, B));
    }
}
