package com.javaguru.lessons.lesson4;

class HumanAgeClassifier {

    public String classify(int age) {
        if (age < 0) {
            return "Age must be positive number";
        }
        if (age >= 0 && age <= 2) {
            return "Baby";
        } else if (age >= 3 && age <= 12) {
            return "Child";
        } else if (age >= 13 && age <= 18) {
            return "Teenager";
        } else if (age >= 19 && age <= 25) {
            return "Happy human";
        } else if (age >= 26 && age <= 64) {
            return "Working - depressed - horse";
        } else if (age >= 65 && age <= 120) {
            return "Senior";
        }
        return "DEAD";
    }

}
