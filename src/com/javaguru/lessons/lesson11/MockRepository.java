package com.javaguru.lessons.lesson11;

class MockRepository extends Repository {

    private boolean triggered;

    public boolean isTriggered() {
        return triggered;
    }

    @Override
    public void save(String input) {
        triggered = true;
    }
}
