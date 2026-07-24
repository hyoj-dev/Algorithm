import java.util.*;

class Solution {
    List<Integer>[] graph;
    int[] dist;
    
    public int solution(int n, int[][] edge) {
        graph = new ArrayList[n + 1];
        dist = new int[n + 1];
        
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] vertexArr : edge) {
            int from = vertexArr[0];
            int to = vertexArr[1];
            
            graph[from].add(to);
            graph[to].add(from);
        }
        
        bfs(1);
        
        int answer = 0;
        int maxValue = 0;
        
        for(int value : dist) {
            maxValue = Math.max(maxValue, value);
        }
        
        for(int value : dist) {
            if(maxValue == value) answer++;
        }
        
        return answer;
    }
    
    private void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean[] visited = new boolean[graph.length];
        
        q.offer(start);
        visited[start] = true;
        dist[start] = 0;
        
        while(!q.isEmpty()) {
            int nowVertex = q.poll();
            
            for(int next : graph[nowVertex]) {
                if(visited[next]) continue;
                
                visited[next] = true;
                dist[next] = dist[nowVertex] + 1;
                q.offer(next);
            }
        }
    }
}