import java.util.Arrays;
import java.util.Collections;

public class SortReverseArray {
    public static void main(String[] args) {
        // Original array
        Integer[] numbers = {40, 10, 30, 20, 50};

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted in ascending order: " + Arrays.toString(numbers));

        // Sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + Arrays.toString(numbers));

        // Manually reverse the array
        reverseArray(numbers);
        System.out.println("Manually reversed: " + Arrays.toString(numbers));
    }

    // Method to reverse an array manually
    public static void reverseArray(Integer[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
