// Sum of Numbers in an array code

import java.util.Scanner;

public class SumOfNumbers_Array_ScannerClass {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number of elements in an array: ");
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " numbers: ");
            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
                sum += numbers[i];

            }

            System.out.print("Sum of the entered numbers in array is : " + sum);

            scanner.close();

        }

    }
}
