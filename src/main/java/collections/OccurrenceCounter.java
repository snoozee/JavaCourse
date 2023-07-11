package collections;

import java.util.List;

public class OccurrenceCounter {
    public static int countOccurance(List<String> words, String target){
        int count = 0;

        for(String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> wordList = List.of("Bradley", "Leopard-1", "Leopard-2", "T-72", "Bradley", "T-90");
        String targetWord = "Bradley";

        int occurrenceCount = countOccurance(wordList, targetWord);
        System.out.println("The word '" + targetWord + "' occurs " + occurrenceCount + " times.");
    }
}
