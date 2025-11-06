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

            int cnt;
            int[] check = new int[10];
            for (int i = 1; true; i++) {
                cnt = i;
                String num = String.valueOf(i * N);
                for (char c : num.toCharArray()) {
                    check[c-'0'] += 1;
                }
                boolean flag = true;
                for (int i1 : check) {
                    if (i1 == 0) flag = false;
                }
                if (flag) break;
            }
            System.out.println("#" + testCase + " " + cnt * N);
        }
    }
}