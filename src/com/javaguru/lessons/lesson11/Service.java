package com.javaguru.lessons.lesson11;

class Service {

    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void add(String input) {
        repository.save(input);
    }
}
