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
            System.out.println("Собачка " + getName() + " пробіг " + length + " метрів");
        } else {
            System.out.println("Собачка " + getName() + " не вміє бігати так далеко");
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
