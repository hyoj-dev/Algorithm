import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String numStr = br.readLine();
            int len = numStr.length();
            String leading = numStr.substring(0, Math.min(3, len));

            double val = Double.parseDouble(leading);
            double base = val / Math.pow(10, leading.length() - 1);

            double rounded = Math.round(base * 10.0) / 10.0;

            int exp = len - 1;

            if (rounded >= 10) {
                rounded /= 10;
                exp++;
            }

            sb.append("#").append(test_case).append(" ")
              .append(String.format("%.1f", rounded))
              .append("*10^").append(exp).append("\n");
        }

        System.out.print(sb);
    }
}
