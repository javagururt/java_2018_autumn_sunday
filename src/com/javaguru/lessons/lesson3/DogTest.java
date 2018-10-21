package com.javaguru.lessons.lesson3;

class DogTest {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        String dogName = myDog.getName();
        System.out.println("Dog name: " + dogName);

        myDog.setName("Bobik");

        dogName = myDog.getName();
        System.out.println("Dog name: " + dogName);

        System.out.println("Dog name: " + myDog.getName());

        System.out.println("Dog age: " + myDog.getAge());
        myDog.setAge(10);
        System.out.println("Dog age: " + myDog.getAge());

        myDog.setWeight(9.5);
        System.out.println("Dog weight: " + myDog.getWeight());


        myDog.sleep();
        myDog.eat();

        Dog secondDog = new Dog();
        secondDog.setWeight(13.4);
        secondDog.setAge(2);
        secondDog.setName("Tuz1k");

        System.out.println();
        System.out.println("Second Dog name: " + secondDog.getName());
        System.out.println("Second Dog age: " + secondDog.getAge());
        System.out.println("Second Dog weight: " + secondDog.getWeight());
    }
}
