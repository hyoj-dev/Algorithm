import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = 10;
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] arr = new int[100][100];
			int tc = Integer.parseInt(br.readLine());
			
			for(int i = 0 ; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for(int j = 0 ; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			
			int answer = Integer.MIN_VALUE;
			//가로
			for (int[] nums : arr) {
				int sum = Arrays.stream(nums).sum();
				answer = Math.max(answer, sum);
			}
			//세로
			for(int i = 0 ; i < 100; i++) {
				int sum = 0;
				for(int j = 0; j < 100; j++) sum += arr[j][i];
				answer= Math.max(answer, sum);
			}
			//대각선 우
			int sum = 0;
			for(int i = 0; i < 100; i++) {
				sum += arr[i][i];
			}
			answer = Math.max(answer, sum);
			//대각선 좌
			sum = 0;
			for(int i = 99 ; i >= 0; i--) {
				sum += arr[i][i];
			}
			answer = Math.max(answer, sum);
			
		
			sb.append("#").append(test_case).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}