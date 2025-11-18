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
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N ; i++) list.add(Integer.parseInt(st.nextToken()));
			
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());

			int x = 0, y = 0;
			
			while(st.hasMoreTokens()) {
				String command = st.nextToken();
				switch (command) {
					case "I":
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						for(int i = 0 ; i < y ; i++) {
							int s = Integer.parseInt(st.nextToken());
							list.add(x, s);
							x++;
						}
						break;
					case "D":
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						for(int i = 0; i < y ; i++) list.remove(x++);
						break;
					case "A":
						y = Integer.parseInt(st.nextToken());
						for(int i = 0; i < y; i++) list.add(Integer.parseInt(st.nextToken()));
						break;
				}
			}
			
			sb.append("#").append(test_case).append(" ");
			for(int i = 0 ; i < 10 ; i++) {
				sb.append(list.get(i)).append(" ");
			}
			sb.append("\n");
			list.clear();
		}
		System.out.print(sb);
	}
}