import java.util.Scanner;

public class DescendingBubbleSortInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take array size from user
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        // Take array elements as input
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bubble sort in descending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
