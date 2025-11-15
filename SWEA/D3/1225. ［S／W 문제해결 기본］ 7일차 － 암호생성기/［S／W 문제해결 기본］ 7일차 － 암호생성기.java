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
			Queue<Integer> q = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			for(int i = 0; i < 8 ; i++) {
				q.offer(Integer.parseInt(st.nextToken()));
			}
			
			
			boolean flag = false;
			while(true) {
				for(int i = 1; i <= 5; i++) {
					int num = q.poll();
					int next = num-i;
					if(next <= 0) {
						q.offer(0);
						flag = true;
						break;
					}
					else q.offer(next);
				}
				if (flag) break;
			}
			
			sb.append("#").append(tc).append(" ");
			
			for (Integer i : q) {
				sb.append(i).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}