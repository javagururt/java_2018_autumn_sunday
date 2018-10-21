package com.javaguru.lessons.lesson3;

public class Dog {

    String name; //null default value
    int age; // 0 default value
    double weight; //0.0 default value

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    void eat() {
        System.out.println("Omnomnom");
    }

    void sleep() {
        System.out.println("ZzzzZ-zzZZz");
    }
}
