import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int answer = 0;

        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();

        stack.push(ch[0]);

        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == '(') {
                stack.push(ch[i]);
            } else {
                if (ch[i - 1] == '(') {
                    stack.pop();
                    answer += stack.size();
                } else {
                    stack.pop();
                    answer += 1;
                }
            }
        }

        System.out.println(answer);
    }
}