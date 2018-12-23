package com.javaguru.lessons.lesson11;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator victim;

    @Before
    public void setUp() {
        victim = new Calculator();
    }

    @Test
    public void shouldSum() {
        int result = victim.sum(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void shouldMultiply() {
        BigDecimal firstNumber = new BigDecimal(2);
        BigDecimal secondNumber = new BigDecimal("2.312122");
        BigDecimal result = victim.multiply(firstNumber, secondNumber);
        BigDecimal expected = new BigDecimal("4.624");

        assertEquals(expected, result);
    }
}
