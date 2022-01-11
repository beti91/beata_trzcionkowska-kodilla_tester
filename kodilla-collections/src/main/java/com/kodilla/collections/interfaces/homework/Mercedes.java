package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    int speed;


    public Mercedes(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed * 2;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = speed / 2;
    }
}
