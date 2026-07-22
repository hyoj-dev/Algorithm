import java.util.*;

class Solution {
    int[][] computers;
    boolean[] visited;
    int n;
    
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;

        visited = new boolean[n];
        
        int answer = 0;
        
        for(int i = 0; i < n; i++) {
            if(!visited[i]) {
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
     
    private void dfs(int current) {
        visited[current] = true;
        
        for(int next = 0; next < n; next++) {
            if(visited[next]) continue;
            if(computers[current][next] == 0) continue;
            
            dfs(next);
        }
    }
}