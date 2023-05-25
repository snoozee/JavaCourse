package participant;

public class Wall implements Obstacle {
    private final double height;
    private final String name;

    public Wall(double height ,String name) {
        this.height = height;
        this.name = name;
    }
    @Override
    public void overcome(Participant participant) {
        if (participant.isSuccess()) {
            if (participant.getJumpLimit() >= height) {
                participant.jump(height);
                System.out.println("Participant " + participant.getName() + " passed an obstacle " + name +
                        " height " + height + " meters.\n");
            } else {
                participant.endPart();
            }

            if (!participant.isSuccess()) {
                System.out.println("Participant " + participant.getName() + " didn't pass an obstacle " + name +
                        " height " + height + " meters. Passed 0.0 meters.\n");
            }
        }
    }
}
