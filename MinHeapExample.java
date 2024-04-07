package java_problems_datastructures;
import java.util.PriorityQueue;

public class MinHeapExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10, 8, 7, 3, 4, 6, 5, 9}; // Given array

        // Create a priority queue (min-heap)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements from the array into the min-heap
        for (int num : arr) {
            minHeap.offer(num); // offer() method adds the element to the heap
        }

        // Print the elements of the min-heap (they will be in sorted order as per min-heap property)
        System.out.println("Min-heap elements:");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // poll() method retrieves and removes the head of the heap
        }
    }
}
