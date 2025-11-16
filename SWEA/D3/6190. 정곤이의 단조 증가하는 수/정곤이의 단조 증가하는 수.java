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
			int N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int[] arr = new int[N];
			for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
			
			int max = -1;
			for(int i = 0; i < N-1 ; i++) {
				for(int j = i+1; j < N ;j++) {
					int mult = arr[i] * arr[j];
					String num = String.valueOf(mult);
					
					if(num.length() < 2) continue;
					
					boolean flag = true;
					
					for(int k = 0; k < num.length()-1 ;k++) {
						if(num.charAt(k) > num.charAt(k+1)) {
							flag = false;
							break;
						}
					}
					if(flag) max = Math.max(max, mult);
				}
			}

			
			sb.append("#").append(test_case).append(" ").append(max).append("\n");
		}
		System.out.print(sb);
	}
}