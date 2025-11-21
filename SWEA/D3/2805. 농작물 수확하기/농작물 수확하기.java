import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.ResolverStyle;
import java.util.*;

public class Solution {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	int[][] arr = new int[N][N];
        	
        	for(int i = 0; i < N ;i++) {
        		String nums = br.readLine();
        		for(int j = 0 ; j < N ;j++) {
        			int num = nums.charAt(j) - '0';
        			arr[i][j] = num;
        		}
        	}
        	
        	int mid = N / 2;
        	int answer = 0;
        	for(int i = 0 ; i < N ;i++) {
        		int dist = Math.abs(i-mid);
        		int left = dist;
        		int right = N - dist - 1;
        		
        		for(int j = left; j <= right; j++) answer += arr[i][j];
        	}
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
