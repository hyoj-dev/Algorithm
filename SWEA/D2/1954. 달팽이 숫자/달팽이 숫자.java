import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        
        for (int i = 1; i <= T; i++) {
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];

            int x = 0, y = 0, dir = 0;
            for (int num = 1; num <= N * N; num++) {
                arr[x][y] = num;

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if (nx < 0 || nx >= N || ny < 0 || ny >= N || arr[nx][ny] != 0) {
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }

            System.out.println("#" + i);
            for (int k = 0; k < N; k++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[k][j] + " ");
                }
                System.out.println();
            }
        }
    }
}