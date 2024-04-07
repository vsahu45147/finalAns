package java_problems_datastructures;
import java.util.HashSet;

public class RepeatingIntegers {
    public static void main(String[] args) {
        int[] array = {4, 2, 4, 5, 2, 3, 1, 3, 5};

        printRepeatingIntegers(array);
    }

    public static void printRepeatingIntegers(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatingSet = new HashSet<>();

        for (int num : array) {
            // If the element is already present in the set, it's a repeating integer
            if (!set.add(num)) {
                repeatingSet.add(num);
            }
        }

        // Print the repeating integers
        System.out.println("Repeating integers in the array:");
        for (int num : repeatingSet) {
            System.out.println(num);
        }
    }
}
