import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] tblA = new int[a][b];
        int[][] tblB = new int[a][b];
        int[][] tblC = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tblA[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tblB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                tblC[i][j] = tblA[i][j] + tblB[i][j];
                System.out.print(tblC[i][j] + " ");
            }
            System.out.println();
        }
    }
}