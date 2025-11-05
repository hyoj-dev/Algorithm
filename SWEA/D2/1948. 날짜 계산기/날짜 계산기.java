import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int start = 0;
            for (int i = 1; i < m1; i++) {
                start += days[i];
            }
            start += d1;

            int end = 0;
            for (int i = 1; i < m2; i++) {
                end += days[i];
            }
            end += d2;

            int result = end - start + 1;

            System.out.println("#" + testCase + " " + result);
        }
    }
}