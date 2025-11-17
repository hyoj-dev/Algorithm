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
			int K = Integer.parseInt(st.nextToken());
			ArrayList<int[]> list = new ArrayList<>();
			for(int i = 0; i < N ; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int volume = Integer.parseInt(st.nextToken());
				int value = Integer.parseInt(st.nextToken());
				list.add(new int[] {volume,value});
			}
			
			int[] dp = new int[K+1];	//w 부피일때의 최대 가치

			for (int[] item : list) {
				int volume = item[0];
				int value = item[1];
				
				for(int w = K; w>=volume; w--) {
					dp[w] = Math.max(dp[w], dp[w-volume]+value);
				}
			}			
			sb.append("#").append(test_case).append(" ").append(dp[K]).append("\n");
		}
		System.out.print(sb);
	}
}