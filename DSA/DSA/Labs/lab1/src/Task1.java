import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integer numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        arrangeEvenOdd(numbers);

        System.out.println("Arranged numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void arrangeEvenOdd(int[] numbers) {
        int[] result = new int[numbers.length];
        int evenIndex = 0;
        int oddIndex = numbers.length - 1;

        for (int number : numbers) {
            if (number % 2 == 0) {
                result[evenIndex++] = number;
            } else {
                result[oddIndex--] = number;
            }
        }

        System.arraycopy(result, 0, numbers, 0, numbers.length);
    }
}
