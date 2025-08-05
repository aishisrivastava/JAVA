// Code for checking if a number is Odd or Even using Ternary Operator in Java

import java.util.Scanner;

public class OddEven_Ternary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number:");
            int number = scanner.nextInt();

            String result = (number % 2 == 0) ? "Even" : "Odd";

            System.out.println("Tne Number is: " + result);

            scanner.close();
        }
    }
}
