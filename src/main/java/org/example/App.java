package org.example;

public class App {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Bob"),
                new Cat("Boris"),
                new Robot("NeBoris")
        };

        Obstacle[] obstacles = {
                new Treadmill(5),
                new Wall(1),
                new Treadmill(10),
                new Treadmill(1000),
                new Wall (5)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                boolean success;
                if (obstacle instanceof Treadmill) {
                    success = obstacle.overcome(participant);
                } else if (obstacle instanceof Wall) {
                    success = obstacle.overcome(participant);
                } else {
                    continue;
                }
                if (!success) {
                    break;
                }
            }
        }
    }
}
