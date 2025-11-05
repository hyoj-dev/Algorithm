import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String N = br.readLine();
            char[] arr = N.toCharArray();

            int cnt = 1;
            char first = arr[0];
            char second = arr[1];
            for (int j = 2; j < arr.length; j++) {
                if (arr[j-1] == first && arr[j] == second) {
                    System.out.println("#" + i + " " + cnt);
                    break;
                }
                cnt++;
            }
        }
    }
}