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
			int mid = N/2;
			int sum = 0;
			
			int start = mid, end = mid;
			
			
			for (int i = 0; i < N; i++) {
				String nums = br.readLine();
				
				for (int j = start; j <= end; j++) {
					sum += nums.charAt(j)-'0';
				}
				
				if(i < mid) { 	//i=0 -> 1 -> 2
					start--;	//s=2 -> 1 -> 0
					end++;		//e=2 -> 3 -> 4
				} 
				else {			//i=3 -> 4
					start++;	//s=1 -> 2
					end--;		//e=3 -> 2
				}
			}
			sb.append("#").append(test_case).append(" ").append(sum).append("\n");
		}
		System.out.print(sb);
	}
}