import java.io.*;
import java.util.*;

class Edge {
    public int vex, cost;

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int V = Integer.parseInt(st1.nextToken());
        int E = Integer.parseInt(st1.nextToken());

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<Edge>());
        }
        int[] check = new int[V + 1];

        for (int i = 0; i < E; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int v1 = Integer.parseInt(st2.nextToken());
            int v2 = Integer.parseInt(st2.nextToken());
            int cost = Integer.parseInt(st2.nextToken());

            graph.get(v1).add(new Edge(v2, cost));
            graph.get(v2).add(new Edge(v1, cost));
        }
        int answer = 0;
        PriorityQueue<Edge> pQ = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.cost - o2.cost;
            }
        });

        pQ.offer(new Edge(1, 0));
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();

            int ev = tmp.vex;
            if (check[ev] == 0) {
                answer += tmp.cost;
                check[ev] = 1;

                for (Edge edge : graph.get(ev)) {
                    if (check[edge.vex]==0) pQ.offer(new Edge(edge.vex, edge.cost));
                }
            }
        }
        System.out.println(answer);

    }
}