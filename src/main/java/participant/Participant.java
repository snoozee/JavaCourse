package participant;

public interface Participant {
    void run(double distance);
    void jump(double height);

    String getName();
    void endPart();

    double getRunLimit();
    double getJumpLimit();

    boolean isSuccess();
}
