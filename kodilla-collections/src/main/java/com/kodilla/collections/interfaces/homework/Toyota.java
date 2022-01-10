package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {

    private int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed * 4;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed() {
        this.speed = speed / 4;
        System.out.println(speed);
    }
}
