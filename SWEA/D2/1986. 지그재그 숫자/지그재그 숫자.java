import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            int sum = 1;
            for (int i = 2; i <= N; i++) {
                if (i % 2 == 0) sum -= i;
                else sum += i;
            }
            System.out.println("#" + testCase + " " + sum);
        }
    }
}