import java.util.InputMismatchException;
import java.util.Scanner;

public class Arirthmetic_Switch {
    public static void main(String[] args) {
        double num1, num2;
        char operator;
        double result = 0.0;

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /, %)");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.print(num1 + "+" + num2 + "=" + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.print(num1 + "-" + num2 + "=" + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.print(num1 + "*" + num2 + "=" + result);
                    break;
                case '/':
                    result = num1 / num2;
                    System.out.print(num1 + "/" + num2 + "=" + result);
                    break;

                case '%':
                    result = num1 % num2;
                    System.out.print(num1 + "%" + num2 + "=" + result);
                    break;

                default:
                    System.out.println("Error: Invalid operator, pls enter correct operator");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid numbers");
        } catch (Exception e) {
            System.out.print("An unexpected error occured" + e.getMessage());
        }

    }
}
