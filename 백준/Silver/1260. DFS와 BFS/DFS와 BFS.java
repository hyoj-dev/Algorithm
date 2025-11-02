import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M, V;
    static int[][] graph;
    static int[] check1, check2;
    static StringBuilder sb = new StringBuilder();

    public static void DFS(int L) {
        sb.append(L).append(" ");
        for (int i = 1; i <= N; i++) {
            if (graph[L][i] == 1 && check1[i] == 0) {
                check1[i] = 1;
                DFS(i);
            }
        }
    }

    public static void BFS(int V) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(V);
        check2[V] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();
            sb.append(now).append(" ");
            for (int i = 1; i <= N; i++) {
                if (graph[now][i] == 1 && check2[i] == 0) {
                    q.offer(i);
                    check2[i] = 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st1.nextToken());
        M = Integer.parseInt(st1.nextToken());
        V = Integer.parseInt(st1.nextToken());

        graph = new int[N + 1][N + 1];
        check1 = new int[N + 1];
        check2 = new int[N + 1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        check1[V] = 1;
        check2[V] = 1;

        DFS(V);
        sb.append('\n');
        BFS(V);

        System.out.println(sb);
    }
}