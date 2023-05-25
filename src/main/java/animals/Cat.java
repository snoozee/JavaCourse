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
            System.out.println("Cat " + getName() + " ran " + length + " meters.");
        } else {
            System.out.println("Cat " + getName() + " can't run so far.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Can't " + getName() + " can't swim.");
    }
}
