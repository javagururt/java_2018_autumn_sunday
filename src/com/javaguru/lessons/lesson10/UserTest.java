package com.javaguru.lessons.lesson10;

class UserTest {

    public static void main(String[] args) {
        UserTest testRunner = new UserTest();
        testRunner.shouldCreateUser();
        testRunner.shouldThrowExceptionAgeLessThanZero();
        testRunner.shouldThrowExceptionAgeGreaterThan120();
    }

    public void shouldCreateUser() {
        User victim = new User("Vasya", 20);
        if (victim != null) {
            System.out.println("shouldCreateUser: OK");
        } else {
            System.out.println("shouldCreateUser: FAIL");
        }
    }

    public void shouldThrowExceptionAgeLessThanZero() {
        try {
            User victim = new User("Vasya", -1);
            System.out.println("shouldThrowExceptionAgeLessThanZero: FAIL");
        } catch (IllegalAgeArgumentException e) {
            System.out.println("shouldThrowExceptionAgeLessThanZero: OK");
        }
    }

    public void shouldThrowExceptionAgeGreaterThan120() {
        try {
            User victim = new User("Vasya", 121);
            System.out.println("shouldThrowExceptionAgeGreaterThan120: FAIL");
        } catch (IllegalAgeArgumentException e) {
            System.out.println("shouldThrowExceptionAgeGreaterThan120: OK");
        }
    }
}
