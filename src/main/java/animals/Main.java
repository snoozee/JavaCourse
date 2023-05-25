package animals;

public class Main {
    public static void main(String[] args) {
        Cat catMurchyk = new Cat("Murcyk");
        catMurchyk.run(150);
        catMurchyk.swim(5);

        Cat catBarsik = new Cat("Barsik");
        catBarsik.run(300);
        catBarsik.swim(5);

        Cat catYousik = new Cat("Yuzik");
        catYousik.run(86);
        catYousik.swim(5);

        Dog dogTuzik = new Dog("Tuzik");
        dogTuzik.run(400);
        dogTuzik.swim(15);

        Dog dogBobik = new Dog("Bobik");
        dogBobik.run(250);
        dogBobik.swim(8);

        Dog dogSharik = new Dog("Sharik");
        dogSharik.run(10);
        dogSharik.swim(32);

        Dog dogBob = new Dog("Bob");
        dogBob.run(10);
        dogBob.swim(32);

        int animalCount = Animal.getAnimalCount();
        System.out.println("Total cats involved: " + Cat.getCatCount());
        System.out.println("Total dogs involved: " + Dog.getDogCount());
        System.out.println("Total animals involved: " + animalCount);
    }
}
