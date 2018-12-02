package com.javaguru.lessons.lesson8.validators;

class StringValidatorTest {

    public static void main(String[] args) {
        Validator[] validators = new Validator[]{
                new MinLengthValidator(),
                new MaxLengthValidator()
        };
        StringValidator validator = new StringValidator(validators);
        boolean result = validator.validate(null);
        System.out.println("Result: " + result);
    }
}
