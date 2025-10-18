import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        int j = 1;
        boolean possible = true;
        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());

            while (j <= target) {
                stack.push(j++);
                sb.append("+\n");
            }

            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                possible = false;
                break;
            }
        }

        if (possible) System.out.println(sb);
        else System.out.println("NO");
    }
}