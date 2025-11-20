import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
	static int dataLen, start, answer = 0;
	static int[][] graph;
	static int[] check;
	
	public static void BFS(int L) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(L);
		check[L] = 1;
		
		int max = 1;
		while (!q.isEmpty()) {
			int cur = q.poll();

			for(int i = 1; i <= 100; i++) {
				if(graph[cur][i] == 1 && check[i] ==0) {
					check[i] = check[cur]+1;
					max = Math.max(max, check[i]);
					q.offer(i);
				}
			}	
		}
		
		int maxNode = 0;
		for(int i = 1; i <= 100 ; i++) {
			if(check[i] == max) {
				maxNode = Math.max(maxNode, i);
			}
		}
		answer = maxNode;	
	}
	

	
	
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	dataLen = Integer.parseInt(st.nextToken());
        	start = Integer.parseInt(st.nextToken());
        	st = new StringTokenizer(br.readLine(), " ");
        	
        	graph = new int[101][101];
        	check = new int[101];
        	
        	for(int i = 0; i < dataLen/2 ; i++) {
        		int s = Integer.parseInt(st.nextToken());
        		int e = Integer.parseInt(st.nextToken());
        		graph[s][e] = 1;
        	}
        	check[start] = 1;
        	
        	BFS(start);
        	
        	
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
