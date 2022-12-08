package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;


    @BeforeEach
    public void setUp()
    {
       calculator = new SimpleCalculator();
    }

    @Test
    public void testIfCalculatedAddWork()
    {
        assertEquals(10,calculator.calculateAdd(4,6));
    }

    @Test
    public void testIfCalculatedSoustractWork()
    {
        assertEquals(-2,calculator.calculateSoustract(4,6));
    }

    @Test
    public void testIfCalculatedMultipliWork()
    {
        assertEquals(24,calculator.calculateMultipli(4,6));
    }

    @Test
    public void testIfCalculatedIsEvenWork()
    {
        //assertEquals(false,calculator.isEven(7));
        //assertEquals(true,calculator.isEven(8));
        assertTrue(calculator.isEven(8));
        assertFalse(calculator.isEven(7));
    }


}