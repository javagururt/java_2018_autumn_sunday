package com.javaguru.lessons.lesson11;

class ServiceMain {

    public static void main(String[] args) {
        Repository repository = new Repository();
        Service service = new Service(repository);
        service.add("ABC");
    }
}
