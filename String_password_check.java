// Pasword Checker using strings in java

import java.util.Scanner;

public class String_password_check {
    public static void main() {
        String org = "ABC";
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
        System.out.println("Enter your password: ");
        String pass = scanner.nextLine();

        
            if (org.equals(pass)) {  // Implemented equals method to check for equality of strings
                System.out.println("Welcome!");
                break;
            } else {
                System.out.println("Re-enter your password..");
            }

        }
        scanner.close();
    }
}
