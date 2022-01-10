package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    private int speed;

    public Volvo(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed * 3;
        System.out.println(speed);
    }

    @Override
    public void decreaseSpeed() {
        this.speed = speed / 3;
        System.out.println(speed);
    }
}

