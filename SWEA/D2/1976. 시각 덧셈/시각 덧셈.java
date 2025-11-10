import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int fH = Integer.parseInt(st.nextToken());
            int fM = Integer.parseInt(st.nextToken());
            int sH = Integer.parseInt(st.nextToken());
            int sM = Integer.parseInt(st.nextToken());

            int resultHour = fH + sH;
            if (resultHour > 12) resultHour -= 12;

            int resultMinute = fM + sM;
            int plusHour = 0;
            if (resultMinute > 59) {
                resultMinute -= 60;
                plusHour++;
            }
            resultHour += plusHour;

            System.out.println("#" + testCase + " " + resultHour + " " + resultMinute);
        }
    }
}