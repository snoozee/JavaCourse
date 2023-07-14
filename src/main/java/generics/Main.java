package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T> List<T> toList(T array[]) {
        // create empty list
        List<T> list = new ArrayList<>();

        // push through an array
        // short - IDEA hint
        Collections.addAll(list, array);
        /**
         * Some highlights say
         * for (T item : array) {
         *     list.add(item);
         * }
         * */

        return list;
    }

    public static List<Apple> createAppleList(int quantity) {
        List<Apple> appleList = new ArrayList<>();
        for (int i = 0; i< quantity; i++) {
            appleList.add(new Apple(1.0F));
        }

        return appleList;
    }

    public static List<Orange> createOrangeList(int quantity) {
        List<Orange> orangeList = new ArrayList<>();
        for (int i = 0; i< quantity; i++) {
            orangeList.add(new Orange(1.0F));
        }

        return orangeList;
    }

    public static void main(String args[]) {
        //String[] myArray = {"SBU", "GUR", "ZSU", "TerOborona"};
        //System.out.println("Array: " + Arrays.toString(myArray));

        String [] fruitsArray = {"apple", "orange", "banana"};
        List<String> fruitsList = toList(fruitsArray);
        System.out.println("List: " + fruitsList);

        Box<Apple> appleBoxPapirovka = new Box<>();
        appleBoxPapirovka.addFruit(new Apple(1.0F));
        appleBoxPapirovka.addFruits(createAppleList(2));
        System.out.println("Apple Box Papirovka Weight: " + appleBoxPapirovka.getWeight());
        System.out.println("Apple Box Papirovka Type: " + appleBoxPapirovka.getType());
        System.out.println("Apple Box Papirovka Size: " + appleBoxPapirovka.getSize());
        System.out.println("Apple Box Papirovka Weight: " + appleBoxPapirovka.getWeight());

        Box<Apple> appleBoxGolden = new Box<>();
        appleBoxGolden.addFruit(new Apple(1.0F));
        appleBoxGolden.addFruits(createAppleList(2));
        System.out.println("Apple Box Golden Weight: " + appleBoxGolden.getWeight());

        boolean compareAppleWeight = appleBoxPapirovka.compare(appleBoxGolden);
        System.out.println("Are apple sorts equal in weight?" + compareAppleWeight);

        appleBoxPapirovka.merge(appleBoxGolden);
        System.out.println("Merged Papirovka Weight: " + appleBoxPapirovka.getWeight());
        System.out.println("Merged Golden Weight: " + appleBoxGolden.getWeight());

        Box<Orange> orangeBoxNatural = new Box<>();
        orangeBoxNatural.addFruit(new Orange(1.5F));
        orangeBoxNatural.addFruits(createOrangeList(3));
        System.out.println("Natural Oranges Weight: " + orangeBoxNatural.getWeight());

        Box<Orange> orangeBoxHybrid = new Box<>();
        orangeBoxHybrid.addFruit(new Orange(1.5F));
        orangeBoxHybrid.addFruits(createOrangeList(3));
        System.out.println("Natural Oranges Weight: " + orangeBoxHybrid.getWeight());

        boolean compareOrangesWeight = orangeBoxNatural.compare(orangeBoxHybrid);
        System.out.println("Are oranges equal in weight?" + compareOrangesWeight);

        orangeBoxNatural.merge(orangeBoxHybrid);
        System.out.println("Merged Oranges Natural Weight: " + orangeBoxNatural.getWeight());
        System.out.println("Merged Oranges Hybrid: " + orangeBoxHybrid.getWeight());
    }
}
