package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void sanityCheck() {
        assertTrue(true); // Always passes, good as a build check
    }
}
