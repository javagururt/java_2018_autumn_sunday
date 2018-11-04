package com.javaguru.lessons.lesson5;

class TVController {

    private TV tv;

    public void connect(TV tv) {
        this.tv = tv;
    }

    public void turnOnTv() {
        tv.turnOn();
    }
}
