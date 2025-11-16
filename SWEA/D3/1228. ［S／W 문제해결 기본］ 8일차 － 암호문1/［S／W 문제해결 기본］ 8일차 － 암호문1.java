import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Command{
	public int x, y;
	public int[] s;
	public Command(int x, int y, int[] s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
}

public class Solution {	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = 10;
		
		for (int test_case = 1; test_case <= T; test_case++) {
			int originalL = Integer.parseInt(br.readLine());
			ArrayList<Integer> oCommand = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i = 0 ; i < originalL; i++) {
				oCommand.add(Integer.parseInt(st.nextToken()));
			}
			int noc = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine(), " ");
			
			ArrayList<Command> list = new ArrayList<>();
			
			while (st.hasMoreElements()) {
				String c = st.nextToken();
				if(c.equals("I")) {
					int x = Integer.parseInt(st.nextToken());
					int y = Integer.parseInt(st.nextToken());
					int[] s = new int[y];
					for(int i = 0; i < y; i++) {
						s[i] = Integer.parseInt(st.nextToken());
					}
					list.add(new Command(x, y, s));
				}
			}
			for (Command c : list) {
				int x = c.x, y = c.y;
				int[] s = c.s;
				for(int i = 0 ; i < y ; i++) oCommand.add(x+i, s[i]);
			}
			
			sb.append("#").append(test_case).append(" ");
			for(int i = 0; i < 10; i++) sb.append(oCommand.get(i)).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}