
// odd and even between 20 to 30
public class odd_even_btw_number {
    public static void main(String[] args) {
        int i;

        System.out.println("Numbers which are even between 20 and 30 are:");
        for (i = 20; i <= 30; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

        System.out.println("Numbers which are odd between 20 and 30 are:");
        for (i = 20; i <= 30; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}