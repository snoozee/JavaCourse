package generics;

public class Fruit {
    private final String type;
    private final float singleWeight;

    public Fruit(String type, float singleWeight) {
        this.type = type;
        this.singleWeight = singleWeight;
    }

    public String getType() {
        return type;
    }

    public float getSingleWeight() {
        return singleWeight;
    }
}
