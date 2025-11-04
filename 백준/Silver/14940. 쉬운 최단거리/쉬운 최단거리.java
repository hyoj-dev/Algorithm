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
    static int n, m;

    static void BFS(int x, int y) {
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x, y));
        dist[x][y] = 0;

        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i], ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] != 0 && dist[nx][ny] == -1) {
                    dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
                    q.offer(new Point(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st1.nextToken());
        m = Integer.parseInt(st1.nextToken());

        board = new int[n][m];
        dist = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dist[i][j] = -1;
            }
        }

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st2.nextToken());
                if (board[i][j] == 2) {
                    x = i;
                    y = j;
                }
                if (board[i][j] == 0) dist[i][j] = 0;
            }
        }
        
        BFS(x,y);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(dist[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}