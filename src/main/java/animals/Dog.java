package animals;

public class Dog extends Animal{
    private static int DogCount;

    public Dog(String name) {
        super(name);
        DogCount++;
    }

    public static int getDogCount() {
        return DogCount;
    }
    @Override
    public void run(int length) {
        if (length <= 500) {
            System.out.println("Dog " + getName() + " ran " + length + " meters.");
        } else {
            System.out.println("Dog " + getName() + " can't run so far.");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= 10) {
            System.out.println("Собачка " + getName() + " проплив " + length + " метрів");
        } else {
            System.out.println("Собачка " + getName() + " не вміє плавати так далеко");
        }
    }
}
