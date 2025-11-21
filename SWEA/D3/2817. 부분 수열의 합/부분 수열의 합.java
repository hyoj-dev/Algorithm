import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {	
	static int N, K, answer;
	static int[] nums;
	static boolean[] visited;

	static void DFS(int L, int sum) {
		if(L == N) {
			if(sum == K) {
				answer++;
			}
			return;
		} else {
			DFS(L+1, sum+nums[L]);
			DFS(L+1, sum);
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	N = Integer.parseInt(st.nextToken());
        	K = Integer.parseInt(st.nextToken());
        	nums = new int[N];
        	
        	st = new StringTokenizer(br.readLine(), " ");
        	for(int i = 0 ;i < N ;i++) {
        		nums[i] = Integer.parseInt(st.nextToken());
        	}
        	
        	answer = 0;
        	DFS(0, 0);
        	
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
