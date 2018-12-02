package com.javaguru.lessons.lesson8.validators;

class MaxLengthValidator extends AbstractValidator {
    @Override
    public boolean validate(String str) {
        if (!assertNotNull(str)) {
            return false;
        }
        return str.length() < 10;
    }
}
