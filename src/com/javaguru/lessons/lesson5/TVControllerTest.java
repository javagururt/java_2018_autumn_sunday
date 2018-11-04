package com.javaguru.lessons.lesson5;

class TVControllerTest {

    public static void main(String[] args) {
        TVController controller = new TVController();
        TV tv = new TV();
        controller.connect(tv);
        controller.turnOnTv();
    }
}
