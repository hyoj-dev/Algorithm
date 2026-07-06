import java.util.*;

class Solution {
    Queue<int[]> queue = new ArrayDeque<>();
    int answer = 0;
    int[] dx = {0, 1, 0, -1};
    int[] dy = {-1, 0 ,1, 0};
    
    public int bfs(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        queue.offer(new int[] {0, 0});
        visited[0][0] = true;
        
        int n = maps.length, m = maps[0].length;
        
        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            
            int x = now[0], y = now[1];
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(maps[nx][ny] == 0) continue;
                if(visited[nx][ny]) continue;
                
                visited[nx][ny] = true;
                maps[nx][ny] = maps[x][y] + 1;
                queue.offer(new int[] {nx, ny});
            }
        } 
        answer = maps[n - 1][m - 1];
        
        return answer == 1 ? -1 : answer;
    }
    
    
    public int solution(int[][] maps) {
        return bfs(maps);
    }
}