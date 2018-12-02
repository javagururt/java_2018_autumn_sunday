package com.javaguru.lessons.lesson8.validators;

abstract class AbstractValidator implements Validator {

    boolean assertNotNull(String arg) {
        return arg != null;
    }
}
