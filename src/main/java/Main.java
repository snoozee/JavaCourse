package src.main.java;

public class Main {
    public static void main(String[] args) {
        Cat catMurchyk = new Cat("Мурчик");
        catMurchyk.run(150);
        catMurchyk.swim(5);

        Cat catBarsik = new Cat("Барсік");
        catBarsik.run(300);
        catBarsik.swim(5);

        Cat catYousik = new Cat("Юзік");
        catYousik.run(86);
        catYousik.swim(5);

        Dog dogTuzik = new Dog("Тузік");
        dogTuzik.run(400);
        dogTuzik.swim(15);

        Dog dogBobik = new Dog("Бобік");
        dogBobik.run(250);
        dogBobik.swim(8);

        Dog dogSharik = new Dog("Шарик");
        dogSharik.run(10);
        dogSharik.swim(32);

        Dog dogBob = new Dog("Боб");
        dogBob.run(10);
        dogBob.swim(32);

        int animalCount = Animal.getAnimalCount();
        System.out.println("Всього котів задіяно: " + Cat.getCatCount());
        System.out.println("Всього собак задіяно: " + Dog.getDogCount());
        System.out.println("Всього тварин задіяно: " + animalCount);
    }
}
