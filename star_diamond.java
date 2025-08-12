public class star_diamond {
    public static void main(String[] args) {
        int rows = 6;
        int i, j, k;

        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // for upper triangle stars printing
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = rows - 1; i >= 1; i--) {
            for (j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // for lower triangle stars printing
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
