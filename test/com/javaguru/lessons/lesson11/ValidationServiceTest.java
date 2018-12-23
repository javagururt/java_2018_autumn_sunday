package com.javaguru.lessons.lesson11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidationServiceTest {

    private ValidationService victim;

    @Before
    public void setUp() throws Exception {
        victim = new ValidationService();
    }

    @Test
    public void shouldValidate() {
        victim.validate("ABC");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        victim.validate(null);
    }
}