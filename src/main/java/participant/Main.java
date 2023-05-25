package participant;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
            new Man("Michael", 120.0, 3.0),
            new Cat("Murchyk", 50.0, 2.0),
            new Robot("Robik", 490.0, 5.0)
        };
        Obstacle[] obstacles = {
            new Treadmill(50.0, "Treadmill-1"),
            new Wall(2.85, "Wall-1"),
            new Treadmill(480.0, "Treadmill-2"),
            new Wall(3.5, "Wall-2")
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overcome(participant);

                if (!participant.isSuccess()) {
                    participant.endPart();
                }
            }
        }

    }
}
