// Code for finding the Greatest Of Three Numbers using Scanner Class in Java

import java.util.Scanner;

public class GreatestOfThreeNumbers_ScannerClass {

    public static void main(String[] args) {

        System.out.print("Running greatest of t3 numbers program");
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.print("Enter third number: ");
            int c = scanner.nextInt();

            int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

            System.out.println("Greatest number is: " + greatest);

            scanner.close();
        }
    }
}
