import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] scores = new int[N + 1];
        for(int i = 1 ; i <= N ;i++){
            scores[i] = Integer.parseInt(br.readLine());
        }

        if (N == 1) {
            System.out.println(scores[1]);
            return;
        }
        if (N == 2) {
            System.out.println(scores[1] + scores[2]);
            return;
        }
        
        int[] dp = new int[N+1];
        dp[1] = scores[1];
        dp[2] = scores[1] + scores[2];
        dp[3] = Math.max(scores[1] + scores[3], scores[2] + scores[3]);

        for (int i = 4; i <= N; i++) {
            int case1 = dp[i - 2] + scores[i];
            int case2 = dp[i - 3] + scores[i - 1] + scores[i];

            dp[i] = Math.max(case1, case2);
        }

        System.out.println(dp[N]);
    }
}