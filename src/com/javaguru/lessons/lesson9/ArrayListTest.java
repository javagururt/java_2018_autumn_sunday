package com.javaguru.lessons.lesson9;

import java.util.ArrayList;
import java.util.List;

class ArrayListTest {

    public static void main(String[] args) {
        ArrayListTest testRunner = new ArrayListTest();
        testRunner.addToEndTest();
//        testRunner.addToStart();
    }

    public void addToEndTest() {
        List<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }

    public void addToStart() {
        List<Integer> integers = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 1_00_000; i++) {
            integers.add(0, i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }

}
