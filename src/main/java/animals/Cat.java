package animals;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }
    @Override
    public void run(int length) {
        if (length <= 200) {
            System.out.println("Кіт " + getName() + " пробіг " + length + " метрів");
        } else {
            System.out.println("Кіт " + getName() + " не вміє бігати так далеко");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Кіт " + getName() + " не вміє плавати");
    }
}
