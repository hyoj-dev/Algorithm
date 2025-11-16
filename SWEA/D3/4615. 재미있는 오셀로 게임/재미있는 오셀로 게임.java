import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	static void play(int[][] board, int x, int y, int bw) {
		board[x][y] = bw;
		
		int opponent = (bw == 1) ? 2 : 1;
		int[] dx = {0,1,1,1,0,-1,-1,-1}, dy = {-1,-1,0,1,1,1,0,-1};
		
		for(int d = 0 ; d < 8 ;d++) {
			int nx = x + dx[d];
			int ny = y + dy[d];
			
			ArrayList<int[]> list = new ArrayList<>();
			
			while(nx >= 0 && nx < board.length && ny >= 0 && ny < board.length) {
				if(board[nx][ny] == opponent) list.add(new int[] {nx, ny});
				else if (board[nx][ny] == bw) {
					for (int[] pos : list) {
						board[pos[0]][pos[1]] = bw;
					}
					break;
				}
				else break;
				nx += dx[d];
				ny += dy[d];
			}
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			int[][] board = new int[N][N];
			board[N/2][N/2] = 2;
			board[N/2][N/2-1] = 1;
			board[N/2-1][N/2-1] = 2;
			board[N/2-1][N/2] = 1;
			
			for(int i = 0; i < M ;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int x = Integer.parseInt(st.nextToken()) - 1;
				int y = Integer.parseInt(st.nextToken()) - 1;
				int bw = Integer.parseInt(st.nextToken());
				
				play(board, x, y, bw);
			}
			
			int black = 0, white = 0;
			for(int i = 0 ; i < N ;i++) {
				for(int j = 0 ; j < N ;j++) {
					if(board[i][j] == 1) black++;
					else if(board[i][j]==2) white ++;
				}
			}

			sb.append("#").append(test_case).append(" ").append(black).append(" ").append(white).append("\n");
		}
		System.out.print(sb);
	}
}