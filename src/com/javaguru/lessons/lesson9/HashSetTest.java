package com.javaguru.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

class HashSetTest {

    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("B");
        strings.add("P");
        strings.add("P");
        strings.add("P");
        strings.add("P");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("D");
        strings.add("O");
        strings.add("A");
        strings.add("S");

        System.out.println(strings);
    }
}
