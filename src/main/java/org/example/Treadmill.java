package org.example;

public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public boolean overcome(Participant participant) {
        if (participant != null) {
            if (participant.getMaxRunDistance() >= length) {
                System.out.printf("\n%s успешно пробежал дорожку длиной " + length, participant.getName());
                return true;
            } else {
                System.out.printf("\n%s не смог пробежать дорожку длиной " + length, participant.getName());
                return false;
            }
        }
        return false;
    }
}
