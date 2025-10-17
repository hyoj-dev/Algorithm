import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int answer = 0;
        int parsed = Integer.parseInt(N);

        while (parsed > 0) {
            if (deSum(String.valueOf(parsed)) == Integer.parseInt(N)) {
                answer = parsed;
                parsed--;
            } else parsed--;
        }
        System.out.println(answer);
    }

    static int deSum(String n) {
        char[] arr = n.toCharArray();
        int sum = Integer.parseInt(n);
        for (char c : arr) {
            sum += Integer.valueOf(c-48);
        }
        return sum;
    }
}