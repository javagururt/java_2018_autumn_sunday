package com.javaguru.lessons.lesson3;

class CalculatorTest {
    public static void main(String[] args) {
        Calculator simpleCalculator = new Calculator();
        int sumResult = simpleCalculator.sum(20, 10);
        System.out.println("Sum result: " + sumResult);

        int multiplicationResult = simpleCalculator.multiply(sumResult, 10);
        System.out.println("Multiplication result: " + multiplicationResult);
    }
}
