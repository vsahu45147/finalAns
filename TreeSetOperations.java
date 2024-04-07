package java_problems_datastructures;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet = new TreeSet<>();

        // Adding elements to the TreeSet
        numberSet.add(10);
        numberSet.add(20);
        numberSet.add(30);
        numberSet.add(40);
        numberSet.add(50);

        // (a) Display the TreeSet
        System.out.println("TreeSet elements: " + numberSet);

        Scanner scanner = new Scanner(System.in);

        // (b) Ask the user to enter a number and search if it is present in the TreeSet
        System.out.print("\nEnter a number to search: ");
        int numberToSearch = scanner.nextInt();
        boolean isPresent = numberSet.contains(numberToSearch);
        System.out.println("Number " + numberToSearch + " is present in the TreeSet: " + isPresent);

        // (c) Remove an element from the TreeSet
        System.out.print("\nEnter a number to remove from the TreeSet: ");
        int numberToRemove = scanner.nextInt();
        boolean removed = numberSet.remove(numberToRemove);
        if (removed) {
            System.out.println("Number " + numberToRemove + " removed from the TreeSet.");
            System.out.println("Updated TreeSet: " + numberSet);
        } else {
            System.out.println("Number " + numberToRemove + " is not present in the TreeSet.");
        }

        scanner.close();
    }
}
