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
        System.out.println("Тваринка пробігла " + length + " метрів");
    }

    public void swim(int length) {
        System.out.println("Тваринка проплила " + length + " метрів");
    }

}
