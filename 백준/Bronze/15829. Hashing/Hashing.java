import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        long r = 1;
        long M = 1234567891;

        for (int i = 0; i < N; i++) {
            int value = str.charAt(i) - 'a' + 1;
            sum = (sum + value * r) % M;
            r = (r * 31 % M);
        }

        System.out.println(sum);
    }
}
