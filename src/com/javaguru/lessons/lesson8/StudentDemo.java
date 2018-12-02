package com.javaguru.lessons.lesson8;

class StudentDemo {

    public static void main(String[] args) {
        Student student = new Student();
        student.learn();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.learn();
        MiddleDeveloper middleDeveloper = new MiddleDeveloper();
        middleDeveloper.learn();

        System.out.println();

        juniorDeveloper.writeCode();
        middleDeveloper.writeCode();

        System.out.println();

        Student[] students = new Student[]{new JuniorDeveloper(), new MiddleDeveloper()};

        for (Student st : students) {
            st.learn();
        }
    }
}
