import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int testCase = 1; testCase <= T; testCase++) {
            int answer = 0;
            String str = br.readLine();
            String reverse = String.valueOf(sb.append(str).reverse());
            if (str.equals(reverse)) answer = 1;
            System.out.println("#"+testCase+" "+ answer);
            sb.setLength(0);
        }
    }
}