import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] coins = new int[N];
        for (int i = 0; i < N; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        int[] dy = new int[K+1];
        for (int i = 1; i <= K; i++) dy[i] = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int coin = coins[i];
            for (int j = coin; j <= K; j++) {
                if (dy[j - coin] != Integer.MAX_VALUE) {
                    dy[j] = Math.min(dy[j], dy[j - coin]+1);
                }
            }
        }

        System.out.println((dy[K] == Integer.MAX_VALUE) ? -1 : dy[K]);
    }
}