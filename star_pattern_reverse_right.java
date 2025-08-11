// Reverse Right Triangle star

import java.util.Scanner;

public class star_pattern_reverse_right {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of stars to print: ");
        int n = scanner.nextInt();
        int i, j;

        // Using for loop
        System.out.println("Using for loop");
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Using while loop
        System.out.println("Using while loop");
        i = n;
        while (i >= 1) {
            j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;

            scanner.close();
        }
    }
}