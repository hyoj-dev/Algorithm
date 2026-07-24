import java.util.*;

class Coordinate {
    public int x;
    public int y;
    
    public Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    char[][] graph;
    int[][] dist;
    
    int[] dx = {0, 1, 0, -1}, dy = {-1, 0, 1, 0};
    
    Coordinate start;
    Coordinate end;
    Coordinate lever;
    
    int n, m;
    
    public int solution(String[] maps) {
        n = maps.length;
        m = maps[0].length();
        
        graph = new char[n][m];
        
        for(int i = 0; i < n; i++) {
            char[] tmp = maps[i].toCharArray();
            
            for(int j = 0; j < m; j++) {
                graph[i][j] = tmp[j];
                
                if(tmp[j] == 'S') start = new Coordinate(i,j);
                else if(tmp[j] == 'E') end = new Coordinate(i,j);
                else if(tmp[j] == 'L') lever = new Coordinate(i,j);
            }
        }
        
        int startToLever = bfs(start, lever);
        if(startToLever == -1) return -1;
        
        int leverToEnd = bfs(lever, end);
        if(leverToEnd == -1) return -1;
        
        return startToLever + leverToEnd;
    }
    
    private int bfs(Coordinate start, Coordinate end) {
        Queue<Coordinate> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        dist = new int[n][m];
        
        q.offer(start);
        visited[start.x][start.y] = true;
        
        while(!q.isEmpty()) {
            Coordinate current = q.poll();
            
            int currentX = current.x, currentY = current.y;
            if(currentX == end.x && currentY == end.y) {
                return dist[currentX][currentY];
            }
                
            for(int i = 0; i < 4; i++) {
                int nx = currentX + dx[i], ny = currentY + dy[i];
                
                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(visited[nx][ny] || graph[nx][ny] == 'X') continue;
                
                visited[nx][ny] = true;
                dist[nx][ny] = dist[currentX][currentY] + 1;
                q.offer(new Coordinate(nx, ny));
            }
            
        }
        return -1;
    }
}