import java.util.Arrays;
import java.util.Scanner;

public class UserInputDescendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input elements from the user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(numbers);

        // Reverse for descending order
        reverseArray(numbers);

        // Print result
        System.out.println("Array sorted in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Reverse method
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
