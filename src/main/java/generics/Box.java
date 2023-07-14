package generics;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> fruisToAdd) {
        fruits.addAll(fruisToAdd);
    }

    public String getType() {
        if (fruits.isEmpty()) {
            return "bad fruit";
        }

        return fruits.get(0).getType();
    }

    public int getSize() {
        return fruits.size();
    }

    public float getWeight() {
        float totalWeight = 0.0F;

        for (T fruit: fruits) {
            totalWeight += fruit.getSingleWeight();
        }

        return totalWeight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void merge(Box<T> otherbox) {
        fruits.addAll(otherbox.fruits);
        otherbox.fruits.clear();
    }
}
