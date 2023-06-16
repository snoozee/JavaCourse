package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToList {
    public static <T> List<T> toList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numberList = toList(numbers);
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("List: " + numberList);
    }
}
