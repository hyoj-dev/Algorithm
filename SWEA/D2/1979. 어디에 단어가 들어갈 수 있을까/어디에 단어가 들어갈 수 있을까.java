import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st1.nextToken());
            int K = Integer.parseInt(st1.nextToken());

            int[][] board = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < N; j++) {
                    board[i][j] = Integer.parseInt(st2.nextToken());
                }
            }

            int answer = 0;
            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (board[i][j] == 1) cnt++;
                    else {
                        if (cnt == K) answer++;
                        cnt = 0;
                    }
                }
                if (cnt == K) answer++;
            }

            for (int i = 0; i < N; i++) {
                int cnt = 0;
                for (int j = 0; j < N; j++) {
                    if (board[j][i] == 1) cnt++;
                    else {
                        if (cnt == K) answer++;
                        cnt = 0;
                    }
                }
                if (cnt == K) answer++;
            }

            sb.append("#").append(testCase).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}