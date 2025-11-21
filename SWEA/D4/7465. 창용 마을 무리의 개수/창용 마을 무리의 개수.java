import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.ResolverStyle;
import java.util.*;

public class Solution {	
	static int N, M;
	static int[][] graph;
	static boolean[] visited;
	
	public static void BFS(int L) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(L);
		visited[L] = true;
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			
			for(int i = 1; i <= N ;i++) {
				if(graph[cur][i] == 1 && !visited[i]) {
					visited[i] = true;
					q.offer(i);
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	N = Integer.parseInt(st.nextToken());
        	M = Integer.parseInt(st.nextToken());
        	
        	graph = new int[N+1][N+1];
        	visited = new boolean[N+1];
        	Arrays.fill(visited, false);
        	
        	for(int i = 0 ; i < M; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		int x = Integer.parseInt(st.nextToken());
        		int y = Integer.parseInt(st.nextToken());
        		graph[x][y] = graph[y][x] = 1;
        	}
        	
        	int answer = 0;
        	for(int i = 1; i <= N ;i++) {
        		if(!visited[i]) {
        			BFS(i);
        			answer++;
        		}
        	}
        	
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
