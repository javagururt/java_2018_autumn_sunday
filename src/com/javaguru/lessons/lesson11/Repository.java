package com.javaguru.lessons.lesson11;

import java.util.ArrayList;
import java.util.List;

class Repository {

    private List<String> database;


    public Repository() {
        database = new ArrayList<>();
    }

    public void save(String input) {
        database.add(input);
        System.out.println("ADDED");
    }
}
