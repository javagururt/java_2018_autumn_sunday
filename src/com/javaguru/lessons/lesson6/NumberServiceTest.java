package com.javaguru.lessons.lesson6;

class NumberServiceTest {

    public static void main(String[] args) {
//        NumberService numberService = new NumberService();
//        numberService.printRange(1, 10);
//        System.out.println();
//        numberService.printRange(-3, 5);
//        System.out.println();
//        numberService.printRange(5, -3);

        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.test1();
    }

    void test1() {
        NumberService victim = new NumberService();
        int actual = victim.evenNumberCountInRange(0, 10);
        int expected = 5;
        if (expected == actual) {
            System.out.println("Test 1: OK");
        } else {
            System.out.println("Test 1: FAIL. Expected: " + expected + ", actual: " + actual);
        }
    }

}
