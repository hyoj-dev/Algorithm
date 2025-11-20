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
        	String original = br.readLine();
        	int len = original.length();
        	
        	int answer = 0 ;
        	char cur = '0';
        	
        	for(int i = 0; i < len; i++) {
        		if(original.charAt(i) != cur) {
        			answer++;
        			cur = original.charAt(i);
        		}
        	}
        	
        	sb.append("#").append(test_case).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}
