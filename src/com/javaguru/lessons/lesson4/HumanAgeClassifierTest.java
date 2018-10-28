package com.javaguru.lessons.lesson4;

class HumanAgeClassifierTest {

    public static void main(String[] args) {
        HumanAgeClassifierTest testRunner = new HumanAgeClassifierTest();
        testRunner.test1();
        testRunner.test2();
    }


    void test1() {
        HumanAgeClassifier victim = new HumanAgeClassifier();
        String expectedResult = "Baby";
        String actualResult = victim.classify(0);
        String testName = "Test 1";

        check(expectedResult, actualResult, testName);
    }

    void test2() {
        HumanAgeClassifier victim = new HumanAgeClassifier();
        String expectedResult = "Age must be positive number";
        String actualResult = victim.classify(-10);
        String testName = "Test 2";

        check(expectedResult, actualResult, testName);
    }

    void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result: " + expectedResult
                    + " but was " + actualResult);
        }
    }

}
