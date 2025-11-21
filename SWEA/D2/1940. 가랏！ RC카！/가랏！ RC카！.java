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
        	
        	int speed = 0, dist = 0;
        	for(int i = 0 ; i < N ;i++) {
        		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        		int command = 0, value = 0;
        		
        		if(st.countTokens()==2) {
        			command = Integer.parseInt(st.nextToken());
        			value = Integer.parseInt(st.nextToken());
        		} else {
        			command = Integer.parseInt(st.nextToken());
        		}
        		
        		if(command == 1) {
        			speed += value;
        			dist += speed;
        		} else if(command == 2) {
        			speed -= value;
        			if(speed < 0) speed = 0;
        			dist += speed;
        		} else if(command == 0) {
        			dist += speed;
        		}
        	}

        	sb.append("#").append(test_case).append(" ").append(dist).append("\n");

        }
        System.out.print(sb);
    }
}
