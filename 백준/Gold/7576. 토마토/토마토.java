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
    static int N, M;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static int[][] box, dist;
    static Queue<Point> q = new LinkedList<>();

    public static void BFS() {
        while (!q.isEmpty()) {
            Point tmp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i], ny = tmp.y + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < M) {
                    if (box[nx][ny] == 0) {
                        box[nx][ny] = 1;
                        q.offer(new Point(nx, ny));
                        dist[nx][ny] = dist[tmp.x][tmp.y] + 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st1.nextToken());
        N = Integer.parseInt(st1.nextToken());

        box = new int[N][M];
        dist = new int[N][M];

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < M; j++) {
                int tomato = Integer.parseInt(st2.nextToken());
                box[i][j] = tomato;
                if (tomato == 1) q.offer(new Point(i, j));
            }
        }

        BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) flag = false;
            }
        }
        if (flag) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    answer = Math.max(answer, dist[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}