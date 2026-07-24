import java.util.*;

class Node implements Comparable<Node>{
    public int vertex;
    public int cost;
    
    Node (int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.cost, other.cost);
    }
}

class Solution {
    int N, K;
    List<Node>[] graph;
    
    int[] dist;
    
    public int solution(int N, int[][] road, int K) {
        this.N = N;
        this.K = K;
        
        graph = new ArrayList[N + 1];
        dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        for(int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] currentRoad : road) {
            int from = currentRoad[0];
            int to = currentRoad[1];
            int cost = currentRoad[2];

            graph[from].add(new Node(to, cost));
            graph[to].add(new Node(from, cost));
        }
        
        dijkstra(1);
        
        int answer = 0;
        
        for(int value : dist) {
            if(value == Integer.MAX_VALUE) continue;
            
            if(value <= K) answer++;
        }
        
        return answer;
    }
    
    private void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        pq.offer(new Node(start, 0));
        dist[start] = 0;
        
        while(!pq.isEmpty()) {
            Node now = pq.poll();
            
            int nowVertex = now.vertex;
            int nowCost = now.cost;
            
            if(nowCost > dist[nowVertex]) continue;
            
            for(Node next : graph[nowVertex]) {
                int nextVertex = next.vertex;
                int nextCost = next.cost;
                
                int newCost = nowCost + nextCost;
                
                if(newCost < dist[nextVertex]) {
                    dist[nextVertex] = newCost;
                    pq.offer(new Node(nextVertex, newCost));
                }
            }
        }
    }
}