package com.javaguru.lessons.lesson8.validators;

class MinLengthValidator extends AbstractValidator {
    @Override
    public boolean validate(String str) {
        if (!assertNotNull(str)) {
            return false;
        }
//        if (str.length() <= 3) {
//            return false;
//        } else {
//            return true;
//        }
        return str.length() > 3;
    }
}
