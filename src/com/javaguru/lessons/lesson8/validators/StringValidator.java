package com.javaguru.lessons.lesson8.validators;

class StringValidator extends AbstractValidator {

    private Validator[] validators;

    public StringValidator(Validator[] validators) {
        this.validators = validators;
    }

    @Override
    public boolean validate(String str) {
        for (Validator validator : validators) {
            if (!validator.validate(str)) {
                return false;
            }
        }
        return true;
    }
}
