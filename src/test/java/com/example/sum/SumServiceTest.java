package com.example.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumServiceTest {
    private SumService sumService = new SumService();

    @Test
    public void testSum() {
        assertEquals(5, sumService.sum(2, 3));
    }
}
