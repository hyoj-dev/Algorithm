import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<int[]> cost = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int R = Integer.parseInt(st.nextToken()),
                    G = Integer.parseInt(st.nextToken()),
                    B = Integer.parseInt(st.nextToken());
            cost.add(new int[]{R, G, B});
        }

        int[][] dp = new int[N][3];

        dp[0][0] = cost.get(0)[0];
        dp[0][1] = cost.get(0)[1];
        dp[0][2] = cost.get(0)[2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost.get(i)[0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost.get(i)[1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost.get(i)[2];
        }

        sb.append(Math.min(Math.min(dp[N - 1][0], dp[N - 1][1]), dp[N - 1][2]));

        System.out.print(sb);
    }
}