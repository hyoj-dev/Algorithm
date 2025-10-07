import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        HashMap<Character, Double> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put((char) ('A' + i), (double) nums[i]);
        }


        Stack<Double> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                stack.push(map.get(c));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.printf("%.2f\n", stack.pop());
    }
}