import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] primes = {2, 3, 5, 7, 11};
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());

            ArrayList<Integer> counts = new ArrayList<>();

            for (int prime : primes) {
                int cnt = 0;
                while (N % prime == 0) {
                    N /= prime;
                    cnt++;
                }
                counts.add(cnt);
            }

            sb.append("#").append(testCase).append(" ");

            for (Integer count : counts) {
                sb.append(count).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}