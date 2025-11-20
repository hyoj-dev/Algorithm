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
        	
        	ArrayList<int[]> pascal = new ArrayList<>();
        	pascal.add(new int[] {1});
        	
        	for(int i = 1 ; i < N ; i++) {
        		pascal.add(new int[i+1]);
        		int[] before = pascal.get(i-1);
        		int[] now = pascal.get(i);
        		for(int j = 0 ; j < i+1; j++) {
        			if(j == 0) now[0] = 1;
        			else {
        				if(before.length > j) now[j] = before[j-1]+before[j];
        				else now[j] = 1;
        			}
        		}
        	}
            sb.append("#").append(test_case).append("\n");
            for (int[] is : pascal) {
				for(int i = 0 ; i < is.length; i++) {
					sb.append(is[i]).append(" ");
				}
				sb.append("\n");
			}
        }
        System.out.print(sb);
    }
}
