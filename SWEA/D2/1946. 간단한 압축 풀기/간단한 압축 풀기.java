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
            int cnt = 0;
            System.out.println("#" + testCase);
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String c = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                for (int j = 0; j < num; j++) {
                    sb.append(c);
                    cnt++;

                    if (cnt == 10) {
                        cnt = 0;
                        sb.append('\n');
                    }
                }
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}