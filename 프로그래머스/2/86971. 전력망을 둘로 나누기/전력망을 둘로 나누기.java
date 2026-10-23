import java.util.*;

class Solution {
    List<Integer>[] graph;
    boolean[] visited;
    int count;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        graph = new ArrayList[n + 1];
        
        for(int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        
        for(int[] wire : wires) {
            int a = wire[0], b = wire[1];
            
            graph[a].add(b);
            graph[b].add(a);
        }
        
        for(int[] wire : wires) {
            visited = new boolean[n + 1];
            count = 0;
            
            int a = wire[0], b = wire[1];
            
            dfs(1, a, b);
            
            int diff = Math.abs(count - (n - count));
            answer = Math.min(diff, answer);
        }
        
        return answer;
    }
    
    private void dfs(int node, int a, int b) {
        visited[node] = true;
        count++;
        
        for(int next : graph[node]) {
            if((node == a && next == b) || (node == b && next == a)) continue;
            if(visited[next]) continue;
            
            dfs(next, a, b);
        }
    }
}