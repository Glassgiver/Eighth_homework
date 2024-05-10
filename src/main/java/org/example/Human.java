package org.example;

public class Human implements Participant {
    private String name;
    private int maxRunDistance = 3;
    private int maxJumpHeight = 1;

    public Human(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " бежит");
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    @Override
    public String getName() {
        return name;
    }
}
