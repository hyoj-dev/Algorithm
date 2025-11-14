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
			int dump = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int[] count = new int[101];
			
			int high = 0, low = 100;
			for (int i = 0; i < 100; i++) {
				int h = Integer.parseInt(st.nextToken());
				count[h]++;
				high = Math.max(high, h);
				low = Math.min(low, h);
			}
			
			for (int i = 0; i < dump; i++) {
				if(high - low <=1) break;
				
				count[high]--;
				count[high-1]++;
				
				count[low]--;
				count[low+1]++;
				
				if (count[high] == 0) high--;
				if (count[low] == 0) low++;
			}	
			sb.append("#").append(test_case).append(" ").append(high-low).append("\n");
		}
		System.out.print(sb);
	}
}