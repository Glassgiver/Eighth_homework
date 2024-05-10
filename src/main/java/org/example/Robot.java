package org.example;

public class Robot implements Participant {
    private String name;
    private int maxRunDistance = 100;
    private int maxJumpHeight = 1;

    public Robot(String name) {
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
    public String getName() {
        return name;
    }
}
