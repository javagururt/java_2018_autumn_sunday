package com.javaguru.lessons.lesson5;

import java.util.Objects;

class TV {

    private boolean turnedOn;
    private int currentChannel;

    public TV() {
    }

    public TV(boolean turnedOn, int currentChannel) {
        this.turnedOn = turnedOn;
        this.currentChannel = currentChannel;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void nextChannel() {
        if (isTurnedOn()) {
            currentChannel++;
        }
    }

    public void previousChannel() {
        if (isTurnedOn()) {
            currentChannel--;
        }
    }

    public void turnOn() {
        turnedOn = true;
        System.out.println("Turned ON");
    }

    public void turnOff() {
        turnedOn = false;
    }

    public String toString() {
        return "CurrentChannel: " + currentChannel + ", turnedOn: " + turnedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return turnedOn == tv.turnedOn &&
                currentChannel == tv.currentChannel;
    }

    @Override
    public int hashCode() {

        return Objects.hash(turnedOn, currentChannel);
    }
}
