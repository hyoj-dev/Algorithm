import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.peek());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "pop":
                    if (stack.isEmpty()) System.out.println(-1);
                    else System.out.println(stack.pop());
                    break;
            }
        }
    }
}