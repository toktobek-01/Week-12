import java.util.Arrays;

public class DescendingSortIntArray {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};

        // Step 1: Sort in ascending order
        Arrays.sort(numbers);

        // Step 2: Reverse the sorted array to get descending order
        reverseArray(numbers);

        System.out.println("Sorted in descending order: " + Arrays.toString(numbers));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap values
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
