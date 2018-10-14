package com.javaguru.lessons.lesson2;

public class MathOperations {
    public static void main(String[] args) {
        int firstNumber = 200;
        int secondNumber = 300;
        int sumResult = firstNumber + secondNumber;
        System.out.println("Sum result: " + sumResult);

        float thirdNumber = 3.14f;
        double fourthNumber = 123.1;
        double subtractionResult = fourthNumber - thirdNumber;
        System.out.println("Subtraction result: " + subtractionResult);

        double multiplyResult = secondNumber * thirdNumber;
        System.out.println("Multiplication result: " + multiplyResult);

        double divisionResult = secondNumber / (double) firstNumber;
        System.out.println("Division result: " + divisionResult);
    }
}
