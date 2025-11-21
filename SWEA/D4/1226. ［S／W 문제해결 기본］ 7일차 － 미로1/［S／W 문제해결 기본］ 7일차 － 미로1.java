import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
	static int answer, endX, endY;
	static int[][] miro;
	static int[] dx = {-1,0,1,0}, dy = {0,1,0,-1};
	static boolean flag;
	
	public static void DFS(int x, int y) {
		if(x == endX && y == endY) {
			flag = true;
			return;
		} else {
			for(int i = 0 ; i < 4; i++) {
				int nx = x + dx[i], ny = y + dy[i];
				
				if(nx >= 0 && nx<16 && ny>=0 && ny <16 && miro[nx][ny] != 1) {
					miro[nx][ny] = 1;
					DFS(nx,ny);
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
        	int tc = Integer.parseInt(br.readLine());
        	miro = new int[16][16];
        	flag = false;
        	
        	int startX = 0, startY = 0;
        	
        	for(int i = 0; i < 16; i++) {
        		String line = br.readLine();
        		for(int j = 0 ; j < 16 ;j++) {
        			int num = line.charAt(j)-'0';
        			miro[i][j] = num;
        			if(num == 2) {
        				startX = i;
        				startY = j;
        			} else if(num == 3) {
        				endX = i;
        				endY = j;
        			}
        		}
        	}
        	
        	miro[startX][startY] = 1;
        	DFS(startX, startY);
        	
        	sb.append("#").append(tc).append(" ").append((flag) ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
}
