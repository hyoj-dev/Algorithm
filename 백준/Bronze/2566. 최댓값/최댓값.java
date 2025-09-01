import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] tbl = new int[9][9];
        int maxNum = 0;
        int maxC = 0;
        int maxR = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tbl[i][j] = sc.nextInt();

                if (tbl[i][j] > tbl[maxC][maxR]) {
                    maxNum = tbl[i][j];
                    maxC = i;
                    maxR = j;
                }
            }
        }

        maxC = maxC + 1;
        maxR = maxR + 1;

        System.out.println(maxNum);
        System.out.println(maxC + " " + maxR);
    }
}