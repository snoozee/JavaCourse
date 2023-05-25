package src.main.java;

public class Animal {
    private final String name;

    private static int animalCount;

    public static int getAnimalCount() {
        return animalCount;
    }

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public void run(int length) {
        System.out.println("Animal ran " + length + " meters");
    }

    public void swim(int length) {
        System.out.println("Animal  " + length + " meters");
    }

}
