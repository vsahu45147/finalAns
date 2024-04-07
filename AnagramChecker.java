package java_problems_datastructures;
import java.util.HashMap;

public class AnagramChecker {
    public static void main(String[] args) {
        // Declare and initialize two strings
        String str1 = "listen";
        String str2 = "silent";

        // Check if str1 and str2 are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // If lengths of strings are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create HashMap to store frequency of characters in str1
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Update frequency of characters in str1
        for (char c : str1.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Check frequency of characters in str2 and update frequency map accordingly
        for (char c : str2.toCharArray()) {
            if (!charFrequencyMap.containsKey(c)) {
                // If character is not present in str1, they can't be anagrams
                return false;
            }
            // Decrement frequency of character in map
            charFrequencyMap.put(c, charFrequencyMap.get(c) - 1);
            if (charFrequencyMap.get(c) == 0) {
                charFrequencyMap.remove(c); // Remove character if frequency becomes 0
            }
        }

        // If all characters have been checked and map is empty, strings are anagrams
        return charFrequencyMap.isEmpty();
    }
}
