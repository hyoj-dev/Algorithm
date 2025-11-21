import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
	static int N;
	static int[][] rooms;
	static int[] dx = { -1, 0, 1, 0 }, dy = { 0, 1, 0, -1 };
	
	public static int BFS(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x,y});
		
		int startNum = rooms[x][y];
		
		int len = 1;

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int cx = cur[0];
			int cy = cur[1];
			int curNum = rooms[cx][cy];

			for (int d = 0; d < 4; d++) {
				int nx = cx + dx[d];
				int ny = cy + dy[d];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
				
				if (rooms[nx][ny] == curNum+1) {
					q.offer(new int[] {nx,ny});
					len++;
					break;
				}
			}
		}
		return len;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	N = Integer.parseInt(br.readLine());
        	rooms = new int[N][N];
        	
        	for(int i = 0 ; i < N ;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        		for(int j = 0 ; j < N ;j++) {
        			rooms[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int answerRoom = Integer.MAX_VALUE;
        	int answerLen = 0;
        	
        	for(int i = 0 ; i < N ;i++) {
        		for(int j = 0 ; j < N ;j++) {
        			int startNum = rooms[i][j];
        			
        			int len = BFS(i,j);
        			
        			if(len > answerLen) {
        				answerLen = len;
        				answerRoom = startNum;
        			} else if(len == answerLen) {
        				answerRoom = Math.min(answerRoom, startNum);
        			}
        		}
        	}
        	sb.append("#").append(test_case).append(" ").append(answerRoom).append(" ").append(answerLen).append("\n");
        }
        System.out.print(sb);
    }
}
