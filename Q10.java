package java_problems_datastructures;
import java.util.HashMap;
import java.util.Map;

public class Q10 {
    public static void main(String[] args) {
        String largeString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis nec nisi vel ex tincidunt elementum. Ut interdum ultricies nisi, sit amet bibendum libero bibendum ac. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Cras eu nulla sapien. Sed et feugiat orci. Sed commodo, justo ut convallis scelerisque, odio nulla interdum felis, nec interdum felis ipsum ut mauris. Phasellus nec odio eu felis lobortis venenatis sit amet ut metus. Integer sollicitudin ligula at dolor commodo, nec lacinia nunc finibus. Proin ac consectetur lorem. Quisque lobortis auctor erat, in varius mauris efficitur id. Vivamus eget ex ut ante fermentum aliquam.";

        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Split the string into words and iterate through them
        String[] words = largeString.split("\\s+"); // split by whitespace
        for (String word : words) {
            // Convert the word to lowercase to treat words like "Word" and "word" as the same
            String lowercaseWord = word.toLowerCase();

            // Update the frequency count in the map
            int frequency = wordFrequencyMap.getOrDefault(lowercaseWord, 0);
            wordFrequencyMap.put(lowercaseWord, frequency + 1);
        }

        // Find the most occurring words
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
            }
        }

        // Print the most occurring words
        System.out.println("Most occurring words in the string:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
