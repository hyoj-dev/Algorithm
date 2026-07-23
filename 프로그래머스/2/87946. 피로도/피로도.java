import java.util.*;

class Solution {
    int[][] dungeons;
    boolean[] visited;
    int answer;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        this.visited = new boolean[dungeons.length];
        
        dfs(k, 0);
        
        return answer;
    }
    
    private void dfs(int tired, int count) {
        answer = Math.max(answer, count);
        
        for(int i = 0; i < dungeons.length; i++) {
            if(visited[i]) continue;
            
            if(tired < dungeons[i][0]) continue;
            
            visited[i] = true;
            
            dfs(tired - dungeons[i][1], count + 1);
            
            visited[i] = false;
        }
    }
 }