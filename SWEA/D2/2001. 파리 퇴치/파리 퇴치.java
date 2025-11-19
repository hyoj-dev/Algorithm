import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	int N = Integer.parseInt(st.nextToken());
        	int M = Integer.parseInt(st.nextToken());
        	int[][] flies = new int[N][N];
        	
        	for(int i = 0 ; i < N ; i++) {
        		st = new StringTokenizer(br.readLine(), " ");
        		for(int j = 0 ; j < N ;j++) {
        			flies[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
        	
        	int[][] ps = new int[N+1][N+1];
        	for(int i = 0 ; i < N ; i++) {
        		for(int j = 0 ; j < N ; j++) {
        			ps[i+1][j+1] = ps[i][j+1]+ps[i+1][j] - ps[i][j] + flies[i][j];
        		}
        	}
        	
        	int max = Integer.MIN_VALUE;
        	for(int i = 0 ; i <= N-M; i++) {
        		for(int j = 0 ; j <= N-M; j++) {
        			int x1 = i, y1 = j;
        			int x2 = i+M-1, y2 = j+M-1;
        			
        			int sum = ps[x2+1][y2+1] - ps[x1][y2+1] - ps[x2+1][y1] + ps[x1][y1];
        			
        			max = Math.max(max, sum);
        		}
        	}       	
            sb.append("#").append(test_case).append(" ").append(max).append("\n");
        }
        System.out.print(sb);
    }
}