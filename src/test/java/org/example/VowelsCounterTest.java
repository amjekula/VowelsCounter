package org.example;

import org.junit.Test;


import static org.junit.Assert.*;

public class VowelsCounterTest {

    @Test
    public void testGetCount() {
        assertEquals("Nope!", 5, VowelsCounter.getCount("abracadabra"));
    }
}