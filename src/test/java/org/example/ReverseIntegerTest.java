package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        ReverseInteger reverseInt = new ReverseInteger();

        assertEquals(321, reverseInt.reverse(123));
        assertEquals(-321, reverseInt.reverse(-123));
        assertEquals(0, reverseInt.reverse(0));
        assertEquals(1, reverseInt.reverse(1));
        assertEquals(-1, reverseInt.reverse(-1));
        assertEquals(21, reverseInt.reverse(120));
        assertEquals(201, reverseInt.reverse(102));
    }
}