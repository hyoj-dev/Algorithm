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
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            ArrayList<Long> list = new ArrayList<>();
            ArrayList<Long> answer = new ArrayList<>();
            
            boolean[] check = new boolean[2*N];
            Arrays.fill(check, false);

            for(int i = 0; i < 2*N ;i++) list.add((long) Integer.parseInt(st.nextToken()));
            
            for(int i = 0 ; i < 2*N ; i++) {
            	if(check[i]) continue;
            	
            	long dc = list.get(i);
            	
            	if((dc*4)%3 != 0) continue;
            	
            	long x = dc * 4/3;
            	
            	int idx = -1;
            	for(int j = i+1; j < 2*N; j++) {
            		if(check[j] == false && list.get(j) == x) {
            			idx = j;
            			break;
            		}
            	}
            	if(idx != -1) {
            		check[i] = true;
            		check[idx] = true;
            		answer.add(dc);
            	}
            }
            sb.append("#").append(test_case).append(" ");
            for (long a : answer) {
				sb.append(a).append(" ");
			}
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
