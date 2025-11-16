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
			int tc = Integer.parseInt(br.readLine());
			String s = br.readLine();
			String str = br.readLine();
			
			int sLen = s.length();
			int cnt = 0;
			
			for(int i = 0; i <= str.length() - sLen; i++) {
				if(str.substring(i, i+ sLen).equals(s)) cnt++;
			}

			sb.append("#").append(test_case).append(" ").append(cnt).append("\n");
		}
		System.out.print(sb);
	}
}