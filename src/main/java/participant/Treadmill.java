package participant;

public class Treadmill implements Obstacle {
    private final double length;
    private final String name;

    public Treadmill(double length, String name) {
        this.length = length;
        this.name = name;
    }
    @Override
    public void overcome(Participant participant) {
        if (participant.isSuccess()) {
            if (participant.getRunLimit() >= length) {
                participant.run(length);
                System.out.println("Participant " + participant.getName() + " passed obstacle " + name +
                        " length " + length + " meters.\n");
            } else {
                participant.endPart();
            }

            if (!participant.isSuccess()) {
                System.out.println("Participant " + participant.getName() + " didn't pass an obstacle " + name +
                        " length " + length + " meters. Passed 0.0 meters.\n");
            }
        }
    }
}
