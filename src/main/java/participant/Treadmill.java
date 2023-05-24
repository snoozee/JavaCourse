package participant;

public class Treadmill implements Obstacle {
    private final double length;
    private final String name;

    public Treadmill(double length, String name) {
        this.length = length;
        this.name = name;
    }
    @Override
    public void pass(Participant participant) {
        if (participant.isSuccess()) {
            if (participant.getRunLimit() >= length) {
                participant.run(length);
                System.out.println("Учасник " + participant.getName() + " пройшов перешкоду " + name +
                        " довжиною " + length + " метрів.\n");
            } else {
                participant.endPart();
            }

            if (!participant.isSuccess()) {
                System.out.println("Учасник " + participant.getName() + " не пройшов перешкоду " + name +
                        " на відстань " + length + ". Пройшов 0.0\n");
            }
        }
    }
}
