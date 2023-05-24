package participant;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
            new Man("Міша", 120.0, 3.0),
            new Cat("Мурчик", 50.0, 2.0),
            new Robot("Робік", 490.0, 5.0)
        };
        Obstacle[] obstacles = {
            new Treadmill(50.0, "Бігова доріжка-1"),
            new Wall(2.85, "Стіна-1"),
            new Treadmill(480.0, "Бігова доріжка-2"),
            new Wall(3.5, "Стіна-2")
        };

        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.pass(participant);

                if (!participant.isSuccess()) {
                    participant.endPart();
                }
            }
        }

    }
}
