import java.util.Scanner;

public class reverse_digits {
    public static void main(String[] args){
        int n , r, reversed = 0;
        System.out.print("Enter an integer number: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        while(n != 0){
            r = n % 10;
            reversed = reversed * 10 + r;
            n = n / 10;
        }

        System.out.println("The reversed number is: " + reversed);

        scanner.close();

        

    }
}
