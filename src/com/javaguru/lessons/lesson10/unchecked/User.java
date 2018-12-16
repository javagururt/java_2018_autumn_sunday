package com.javaguru.lessons.lesson10.unchecked;

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        if (age < 0) {
            throw new IllegalAgeArgumentException("Age must be greater than zero");
        }
        if (age > 120) {
            throw new IllegalAgeArgumentException("Age must be less than 120");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
