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
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st1.nextToken());
			int L = Integer.parseInt(st1.nextToken());
			
			int[] score = new int[N];
			int[] cal = new int[N];
			
			for (int i = 0; i < N; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
				score[i] = Integer.parseInt(st2.nextToken());
				cal[i] = Integer.parseInt(st2.nextToken());
			}
			
			int[] dp = new int[L+1];
			
			for (int i = 0; i < N; i++) {
				for(int j = L; j >= cal[i]; j--) {
					dp[j] = Math.max(dp[j], dp[j-cal[i]]+score[i]);
				}
			}
			int answer = 0;
			for(int i = 0; i <= L; i++) {
				answer = Math.max(answer, dp[i]);
			}
			sb.append("#").append(test_case).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}