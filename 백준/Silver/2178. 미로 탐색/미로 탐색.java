import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Point {
    public int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[][] board, dist;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static int N, M;

    public static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        dist[x][y] = 1;

        while (!q.isEmpty()) {
            Point tmp = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i], ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= N && ny >= 1 && ny <= M) {
                    if (board[nx][ny] == 1 && dist[nx][ny] == 0) {
                        dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
                        q.offer(new Point(nx, ny));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new int[N+1][M+1];
        dist = new int[N+1][M+1];

        for (int i = 1; i <= N; i++) {
            String line = br.readLine();
            for (int j = 1; j <= M; j++) {
                board[i][j] = line.charAt(j-1)-'0';
            }
        }
        BFS(1, 1);

        System.out.println(dist[N][M]);
    }
}