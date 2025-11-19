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
        	String str = br.readLine();
        	Stack<Character> stack = new Stack<>();
        	
        	boolean answer = true;
        	for (char c : str.toCharArray()) {
				if(stack.empty()) stack.push(c);
				
				if(c == ')') {
					if(stack.peek() == '(') stack.pop();
					else answer = false;
				} else if(c == ']') {
					if(stack.peek() == '[') stack.pop();
					else answer = false;
				} else if(c == '}') {
					if(stack.peek() == '{') stack.pop();
					else answer = false;
				} else if(c == '>') {
					if(stack.peek() == '<') stack.pop();
					else answer = false;
				} else {
					stack.push(c);
				}
			}
            sb.append("#").append(test_case).append(" ").append((answer) ? 1 : 0).append("\n");
        }
        System.out.print(sb);
    }
}
