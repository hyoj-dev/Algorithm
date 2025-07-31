import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] standard = {1, 1, 2, 2, 2, 8};
        int[] found = new int[6];
        int[] count = new int[6];

        for (int i = 0; i < found.length; i++) {
            found[i] = sc.nextInt();
        }

        for (int i = 0; i < found.length; i++) {
            count[i] = standard[i] - found[i];
        }

        for (int i : count) {
            System.out.print(i+" ");
        }
    }
}
