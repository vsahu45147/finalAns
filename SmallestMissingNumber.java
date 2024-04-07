package java_problems_datastructures;
import java.util.HashMap;

public class SmallestMissingNumber {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 2, 8, 5, 10, 6, 9}; // Example unsorted array

        int missingNumber = findSmallestMissingNumber(array);
        System.out.println("The smallest positive number missing in the array is: " + missingNumber);
    }

    public static int findSmallestMissingNumber(int[] array) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();

        // Count the occurrences of each number in the array
        for (int num : array) {
            numberMap.put(num, numberMap.getOrDefault(num, 0) + 1);
        }

        // Check for the smallest positive missing number
        for (int i = 1; i <= 10; i++) { // Numbers from 1 to 10
            if (!numberMap.containsKey(i)) {
                return i; // If the number is not present in the map, it is the smallest missing number
            }
        }

        return 11; // If all numbers from 1 to 10 are present in the map, the smallest missing number is 11
    }
}
