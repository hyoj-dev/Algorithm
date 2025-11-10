import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] price = new int[N];
            for (int i = 0; i < N; i++) price[i] = Integer.parseInt(st.nextToken());

            int max = 0;
            long answer = 0;

            for (int i = N - 1; i >= 0; i--) {
                if (price[i] > max) {
                    max = price[i];
                } else {
                    answer += max - price[i];
                }
            }
            sb.append("#").append(testCase).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}