import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int cNum, cWith, answer = 0;
    static int[][] graph;
    static boolean[] visited;

    public static void DFS(int v) {
        visited[v] = true;

        for (int i = 0; i <= cNum; i++) {
            if (graph[v][i] == 1 && !visited[i]) {
                answer++;
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cNum = Integer.parseInt(br.readLine());
        cWith = Integer.parseInt(br.readLine());

        graph = new int[cNum + 1][cNum + 1];
        visited = new boolean[cNum + 1];

        for (int i = 0; i < cWith; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        DFS(1);
        System.out.println(answer);
    }
}