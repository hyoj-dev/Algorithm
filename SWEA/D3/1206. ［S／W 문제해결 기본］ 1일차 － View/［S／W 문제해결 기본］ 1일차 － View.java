import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.ResolverStyle;
import java.util.*;

public class Solution {	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
        	int N = Integer.parseInt(br.readLine());
        	int[] buildings = new int[N];
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
        	
        	for(int i = 0 ; i < N ;i++) buildings[i] = Integer.parseInt(st.nextToken());
        	
        	int answer = 0;
        	for(int i = 2 ; i < N-2 ;i++) {
        		int b1 = buildings[i-1];
        		int b2 = buildings[i-2];
        		int n1 = buildings[i+1];
        		int n2 = buildings[i+2];
        		
        		int maxTmp1 = Math.max(b1, b2);
        		int maxTmp2 = Math.max(n1, n2);
        		int max = Math.max(maxTmp1, maxTmp2);
        		
        		if(buildings[i] > max) {
        			answer += buildings[i] - max;
        		}	
            }
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
