// printing star pyramid

public class star_pyramid {
    public static void main(String[] args) {
        int rows = 8;
        int i, j, k;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // for printing the stars
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
