import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static char[][] grid, blindGrid;
    static boolean[][] check;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};

    public static void BFS(int x, int y, char[][] map) {
        char color = map[x][y];
        Queue<int[]> q = new LinkedList<>();
        check[x][y] = true;

        q.offer(new int[] {x,y});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int cx = cur[0], cy = cur[1];

            for (int i = 0; i < 4; i++) {
                int nx = cx + dx[i], ny = cy + dy[i];

                if (nx >= 0 && nx < N && ny >= 0 && ny < N ) {
                    if(!check[nx][ny] && map[nx][ny] == color){
                        check[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        grid = new char[N][N];
        blindGrid = new char[N][N];


        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                char c = line.charAt(j);
                grid[i][j] = c;

                if(c == 'G') blindGrid[i][j] = 'R';
                else blindGrid[i][j] = c;
            }
        }

        int normal = 0;
        check = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!check[i][j]) {
                    BFS(i,j,grid);
                    normal++;
                }
            }
        }

        int blind = 0;
        check = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!check[i][j]) {
                    BFS(i,j,blindGrid);
                    blind++;
                }
            }
        }
        System.out.println(normal + " " + blind);
    }
}