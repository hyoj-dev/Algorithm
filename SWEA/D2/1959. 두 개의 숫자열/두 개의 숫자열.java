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
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st1.nextToken());
            int M = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");

            int[] arr1 = new int[N];
            for (int i = 0; i < N; i++) arr1[i] = Integer.parseInt(st2.nextToken());

            int[] arr2 = new int[M];
            for (int i = 0; i < M; i++) arr2[i] = Integer.parseInt(st3.nextToken());


            int[] big = N >= M ? arr1 : arr2;
            int[] small = N >= M ? arr2 : arr1;

            int sum = Integer.MIN_VALUE;
            for (int i = 0; i <= big.length - small.length; i++) {
                int tmp = 0;
                for (int j = 0; j < small.length; j++) {
                    tmp += big[i + j] * small[j];
                }
                sum = Math.max(sum, tmp);
            }


            sb.append("#").append(testCase).append(" ").append(sum).append("\n");

        }
        System.out.println(sb);
    }
}