import java.util.Arrays;

public class IntArraySortReverse {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50};

        // Sort in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted in ascending order: " + Arrays.toString(numbers));

        // Reverse the array manually
        reverseArray(numbers);
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }

    // Method to reverse int[] manually
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
