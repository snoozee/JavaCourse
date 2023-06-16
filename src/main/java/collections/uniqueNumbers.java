package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class uniqueNumbers {
    public static List<Integer> findUnique(List<Integer> numbers) {
        Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);
        return new ArrayList<>(uniqueNumbersSet);
    }

    public static void main(String[] args) {
        List<Integer> numberList = List.of(1, 2, 3, 2, 4, 5, 1, 3);

        List<Integer> uniqueNumbers = findUnique(numberList);
        System.out.println("Original List: " + numberList);
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}
