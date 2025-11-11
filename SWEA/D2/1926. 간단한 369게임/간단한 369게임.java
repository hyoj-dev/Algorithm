import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String num = String.valueOf(i);
            int clap = 0;

            for (char c : num.toCharArray()) {
                if (c == '3' || c == '6' || c == '9') clap++;
            }

            if (clap > 0) {
                for (int j = 0; j < clap; j++) sb.append('-');
            } else {
                sb.append(num);
            }
            sb.append(" ");
        }
        System.out.print(sb);
    }
}