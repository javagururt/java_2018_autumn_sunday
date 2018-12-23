package com.javaguru.lessons.lesson11;

class ValidationService {

     void validate(String input) {
        if (input == null) {
            throw new IllegalArgumentException("String must be not null");
        }
    }
}
