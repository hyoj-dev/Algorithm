import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    static int[] big, small;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st1.nextToken());
            int M = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");

            int[] tmp1 = new int[N];
            for (int i = 0; i < N; i++) tmp1[i] = Integer.parseInt(st2.nextToken());

            int[] tmp2 = new int[M];
            for (int i = 0; i < M; i++) tmp2[i] = Integer.parseInt(st3.nextToken());


            int bigger = Math.max(N, M);
            int smaller = Math.min(N, M);
            if (bigger == N) {
                big = tmp1.clone();
                small = tmp2.clone();
            } else {
                big = tmp2.clone();
                small = tmp1.clone();
            }

            int sum = Integer.MIN_VALUE;
            for (int i = 0; i <= bigger - smaller; i++) {
                int tmp = 0;
                for (int j = 0; j < smaller; j++) {
                    tmp += big[i + j] * small[j];
                }
                sum = Math.max(sum, tmp);
            }


            System.out.println("#" + testCase + " " + sum);

        }
    }
}