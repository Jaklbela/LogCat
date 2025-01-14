package com.example.myapplication;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MainActivityTest {
    int testArray[][] = {{1,2},{1,2}};

    @Test
    public void testCreateMatrix(){
        assertArrayEquals( MainActivity.createMatrix(1, 1), new int[][]{{9}});
    }

    @Test
    public void testMatrixToString(){
        assertNotEquals( MainActivity.matrixToString(testArray),"1 2 1 2");
    }
}
