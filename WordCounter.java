import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordCounter {
    public static void main(String[] args) {
        // Create an array with a set of words
        String[] words = {"гвоздь",  "болт",  "гвоздь",  "шуруп",  "болт",
                "саморез",  "винт",  "муфта",  "винт",  "штифт",
                "анкер", "скоба", "штифт", "заклёпка", "шпилька",
                "гайка", "саморез", "шайба"};

        // Use Set to find unique words
        Set<String> uniqueWords = new HashSet<>();

        // Use Map to count the frequency of each word
        Map<String,  Integer> wordCount = new HashMap<>();

        for (String word :  words) {
            uniqueWords.add(word);
            wordCount.put(word,  wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the list of unique words
        System.out.println("List of unique words: ");
        for (String uniqueWord :  uniqueWords) {
            System.out.println(uniqueWord);
        }

        // Count and print the frequency of each word
        System.out.println("\nFrequency of each word: ");
        for (Map.Entry<String,  Integer> entry :  wordCount.entrySet()) {
            System.out.println(entry.getKey() + ":  "+ entry.getValue());
        }
    }
}
