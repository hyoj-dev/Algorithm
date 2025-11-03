import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, answer;
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    
    public static void DFS(int x, int y) {
        if (board[x][y] == 'P') answer++;
        board[x][y] = 'X';

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i], ny = y + dy[i];
            if (nx >= 0 && nx < N && ny >= 0 && ny < M && board[nx][ny] != 'X') {
                DFS(nx, ny);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];

        int x = 0, y = 0;
        for (int i = 0; i < N; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < M; j++) {
                char c = arr[j];
                board[i][j] = c;
                if (c == 'I') {
                    x = i;
                    y = j;
                }
            }
        }

        DFS(x, y);

        if (answer == 0) System.out.println("TT");
        else System.out.println(answer);
    }
}