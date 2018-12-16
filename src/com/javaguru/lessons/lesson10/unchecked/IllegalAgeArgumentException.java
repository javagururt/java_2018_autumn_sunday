package com.javaguru.lessons.lesson10.unchecked;

class IllegalAgeArgumentException extends RuntimeException {

    public IllegalAgeArgumentException(String message) {
        super(message);
    }
}
