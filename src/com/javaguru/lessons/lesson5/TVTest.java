package com.javaguru.lessons.lesson5;

class TVTest {

    public static void main(String[] args) {
        TVTest testRunner = new TVTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    void test1() {
        TV tv = new TV();
        tv.turnOn();

        boolean expected = true;
        boolean actual = tv.isTurnedOn();

        if (expected == actual) {
            System.out.println("Test 1: OK");
        } else {
            System.out.println("Test 1: FAIL");
        }
    }

    void test2() {
        TV tv = new TV();
        String expected = "CurrentChannel: 0, turnedOn: false";
        String actual = tv.toString();

        if (expected.equals(actual)) {
            System.out.println("Test 2: OK");
        } else {
            System.out.println("Test 2: FAIL. Expected: " + expected + ", actual: " + actual);
        }
    }

    void test3() {
        TV victim = new TV();
        victim.turnOn();
        victim.nextChannel();
        victim.nextChannel();

        TV expectedResult = new TV(true, 2);
        if (victim.equals(expectedResult)) {
            System.out.println("Test 3: OK");
        } else {
            System.out.println("Test 2: FAIL. Expected: " + expectedResult + ", actual: " + victim);
        }
    }
}
