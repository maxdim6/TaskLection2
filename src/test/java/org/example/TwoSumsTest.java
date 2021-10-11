package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumsTest {

    @Test
    public void getTwoSum() {
        TwoSums twoSums = new TwoSums();

        int[] result = twoSums.getTwoSum(new int[]{2, 3}, 1);
        assertEquals(0, result.length );

        result = twoSums.getTwoSum(new int[]{1}, 1);
        assertEquals(0, result.length );

        result = twoSums.getTwoSum(new int[]{4, 7, 10, 12, 26}, 19);
        assertArrayEquals(new int[]{7, 12}, result );

        result = twoSums.getTwoSum(new int[]{4, 4, 10, 12, 26}, 8);
        assertArrayEquals( new int[]{4, 4}, result);

    }
}