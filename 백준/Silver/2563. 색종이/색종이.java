import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] paper = new int[100][100];
        int cnt = 0;

        int n = sc.nextInt();

        for (int a = 0; a < n; a++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int i = x; i < x + 10; i++) {
                for (int j = y; j < y + 10; j++) {
                    paper[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper.length; j++) {
                if (paper[i][j] == 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}