package com.javaguru.lessons.lesson6;

class NumberService {

    void printRange(int from, int to) {
        while (from <= to) {
            System.out.println(from);
            from++;
        }
    }

    int evenNumberCountInRange(int from, int to) {
        int evenNumberCounter = 0;
        for (int i = from; i < to; i++) {
            if (i % 2 == 0) {
                evenNumberCounter++;
            }
        }
        return evenNumberCounter;
    }
}
