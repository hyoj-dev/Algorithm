import java.util.*;

class Solution {
    int[] dx = {-1, 1, 0 ,0}, dy = {0, 0, -1, 1};
    
    private int bfs(int[][] maps) {
        int n = maps.length, m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dist = new int[n][m];
        
        Queue<int[]> q = new ArrayDeque<>();
        
        q.offer(new int[] {0, 0});
        visited[0][0] = true;
        dist[0][0] = 1;
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            
            int x = cur[0], y = cur[1];
            
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i], ny = y + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                
                if(maps[nx][ny] == 0 || visited[nx][ny]) continue;
                
                q.offer(new int[]{nx, ny});
                visited[nx][ny] = true;
                dist[nx][ny] = dist[x][y] + 1;
            }
        }
        
        return dist[n - 1][m - 1] == 0 ? -1 : dist[n - 1] [m - 1];
    }
    
    public int solution(int[][] maps) {
        return bfs(maps);
    }
}