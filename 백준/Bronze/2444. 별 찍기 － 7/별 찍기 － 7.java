import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) {
            int spaceCount = (i <= n) ? (n - i) : (i - n);
            int starCount = (i <= n) ? (2 * i - 1) : (2 * (2 * n - i) - 1);

            for (int s = 0; s < spaceCount; s++) {
                System.out.print(" ");
            }

            for (int s = 0; s < starCount; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
