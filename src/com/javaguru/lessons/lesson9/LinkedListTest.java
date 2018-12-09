package com.javaguru.lessons.lesson9;

import java.util.LinkedList;
import java.util.List;

class LinkedListTest {
    public static void main(String[] args) {
        LinkedListTest testRunner = new LinkedListTest();
        testRunner.addToEnd();
//        testRunner.addToStart();

    }

    private void addToEnd() {
        List<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }

    public void addToStart() {
        List<Integer> integers = new LinkedList<>();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10_000_000; i++) {
            integers.add(0, i);
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("Result: " + result + " ms");
    }
}
