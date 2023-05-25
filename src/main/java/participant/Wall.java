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
                System.out.println("Учасник " + participant.getName() + " пройшов перешкоду " + name +
                        " довжиною " + height + " метрів.\n");
            } else {
                participant.endPart();
            }

            if (!participant.isSuccess()) {
                System.out.println("Учасник " + participant.getName() + " не пройшов перешкоду " + name +
                        " на відстань " + height + ". Пройшов 0.0\n");
            }
        }
    }
}
