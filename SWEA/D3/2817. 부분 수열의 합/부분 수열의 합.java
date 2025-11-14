import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Solution {
	static int N, K, answer = 0;
	static int[] nums;
	boolean[] visited;


	static void DFS(int L, int sum) {
		if (L==N) {
			if (sum == K) answer++;
			return;
		}
		else {
			DFS(L+1, sum+nums[L]);
			DFS(L+1, sum);	
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int test_case = 1; test_case <= T; test_case++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			N = Integer.parseInt(st1.nextToken());
			K = Integer.parseInt(st1.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			nums = new int[N];
			for (int i = 0; i < nums.length; i++) {
				nums[i] = Integer.parseInt(st2.nextToken());
			}
			answer = 0;
			DFS(0, 0);
		
			sb.append("#").append(test_case).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}
}