import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int floor = 0;
        int roomNum = 0;

        for (int i = 0; i < T; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            if (n % h == 0) {
                floor = h;
                roomNum = n / h;
            } else {
                floor = n % h;
                roomNum = n / h + 1;
            }
            System.out.println(floor * 100 + roomNum);
        }
    }
}