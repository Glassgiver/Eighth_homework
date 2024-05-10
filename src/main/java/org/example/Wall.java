package org.example;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean overcome(Participant participant) {
        if (participant != null) {
            if (participant.getMaxRunDistance() >= height) {
                System.out.printf("\n%s успешно перепрыгнул стену высотой " + height, participant.getName());
                return true;
            } else {
                System.out.printf("\n%s не смог перепрыгнуть стену высотой " + height, participant.getName());
                return false;
            }
        }
        return false;
    }
}
