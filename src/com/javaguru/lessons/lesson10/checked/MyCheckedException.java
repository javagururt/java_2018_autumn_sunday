package com.javaguru.lessons.lesson10.checked;

class MyCheckedException extends Exception {
    public MyCheckedException() {
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
