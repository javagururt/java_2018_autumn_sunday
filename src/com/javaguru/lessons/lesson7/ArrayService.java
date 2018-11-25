package com.javaguru.lessons.lesson7;

import java.util.Random;

class ArrayService {

    public int[] createArray(int size) {
        return new int[size];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(101);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public double findAverageNumberInArray(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }

        return sum / array.length;
    }
}
