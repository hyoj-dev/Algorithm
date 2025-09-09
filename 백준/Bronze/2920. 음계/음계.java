import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean asc = true;
        boolean desc = true;

        for (int i = 0; i < 8; i++) {
            if (numbers[i] != i + 1) {
                asc = false;
            }
            if (numbers[i] != 8 - i) {
                desc = false;
            }
        }

        if (asc) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}