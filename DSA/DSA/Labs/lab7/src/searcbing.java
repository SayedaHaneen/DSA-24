import java.util.Random;
import java.util.Scanner;

public class searcbing{
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int searchValue = scanner.nextInt();

        // Iterative approach
        long startTimeIterative = System.nanoTime();
        int iterativeResult = iterativeSearch(array, searchValue);
        long endTimeIterative = System.nanoTime();
        long durationIterative = endTimeIterative - startTimeIterative;

        // Recursive approach
        long startTimeRecursive = System.nanoTime();
        int recursiveResult = recursiveSearch(array, searchValue, 0);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = endTimeRecursive - startTimeRecursive;

        System.out.println("Iterative Result: " + iterativeResult + ", Time taken: " + durationIterative + " ns");
        System.out.println("Recursive Result: " + recursiveResult + ", Time taken: " + durationRecursive + " ns");
    }

    public static int iterativeSearch(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return 1;
            }
        }
        return 0;
    }

    public static int recursiveSearch(int[] array, int value, int index) {
        if (index >= array.length) {
            return 0;
        }
        if (array[index] == value) {
            return 1;
        }
        return recursiveSearch(array, value, index + 1);
    }
}
