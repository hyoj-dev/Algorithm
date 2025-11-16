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
			StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st1.nextToken());
			int M = Integer.parseInt(st1.nextToken());
			int K = Integer.parseInt(st1.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);
			

			for(int i = 0 ; i < N ;i++)	pq.offer(Integer.parseInt(st2.nextToken()));

			String answer = "Possible";
			
			if(pq.peek()==0) answer = "Impossible";
			else {
				int total = 0;
				int time = 0;
				while(!pq.isEmpty()) {	
					int arrive = pq.poll();
					
					while(time < arrive) {
						time++;
						if(time % M == 0) total += K;	
					}
					if(total == 0) {
						answer = "Impossible";
						break;
					}
					total--;
				}
			}
			sb.append("#").append(test_case).append(" ").append(answer).append(" ").append("\n");
		}
		System.out.print(sb);
	}
}