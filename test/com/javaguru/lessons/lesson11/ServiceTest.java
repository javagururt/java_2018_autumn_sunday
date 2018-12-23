package com.javaguru.lessons.lesson11;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ServiceTest {

    private MockRepository repository;

    private Service victim;

    @Before
    public void setUp() throws Exception {
        repository = new MockRepository();
        victim = new Service(repository);
    }

    @Test
    public void shouldAdd() {
        victim.add("ABC");
        assertTrue(repository.isTriggered());
    }
}