package com.javaguru.lessons.lesson7;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest testRunner = new ArrayServiceTest();
        testRunner.shouldCreateArray();
        testRunner.shouldFillArrayWithRandomNumbers();
        testRunner.shouldFindAverageNumberInArray();
    }

    void shouldCreateArray() {
        ArrayService victim = new ArrayService();
        int expectedResult = 10;
        int actualResult = victim.createArray(10).length;
        if (expectedResult == actualResult) {
            System.out.println("shouldCreateArray: OK");
        } else {
            System.out.println("shouldCreateArray: FAIL");
        }
    }

    void shouldFillArrayWithRandomNumbers() {
        ArrayService victim = new ArrayService();
        int[] array = new int[10];
        victim.printArrayToConsole(array);
        victim.fillArrayWithRandomNumbers(array);
        System.out.println();
        victim.printArrayToConsole(array);
        System.out.println();
    }


    void shouldFindAverageNumberInArray() {
        ArrayService victim = new ArrayService();
        double[] array = {5, 10, 15};
        double expectedResult = 10;
        double actualResult = victim.findAverageNumberInArray(array);
        if (expectedResult == actualResult) {
            System.out.println("shouldFindAverageNumberInArray: OK");
        } else {
            System.out.println("shouldFindAverageNumberInArray: FAIL");
        }
    }
}
