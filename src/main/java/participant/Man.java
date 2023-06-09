package participant;

public class Man implements Participant {
    private final String name;
    private final double runLimit;
    private final double jumpLimit;
    private boolean success;

    public Man(String name, double runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.success = true;
    }

    @Override
    public void run(double distance) {
        if (success) {
            System.out.println("Participant " + name + " is running " + distance + " meters");
        }
    }

    @Override
    public void jump(double height) {
        if (success) {
            System.out.println("Учасник " + name + " is jumping on  " + height + " meters");
        }
    }

    @Override
    public boolean isSuccess() {
        return success;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getRunLimit() {
        return runLimit;
    }

    @Override
    public double getJumpLimit() {
        return jumpLimit;
    }

    public void endPart() {
        success = false;
    }

}
