import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[][] sdo = new int[9][9];
        for (int testCase = 1; testCase <= T; testCase++) {
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < 9; j++) {
                    sdo[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            boolean flag = true;

            for (int i = 0; i < 9; i++) {
                int sum = 0;
                for (int j = 0; j < 9; j++) sum += sdo[i][j];
                if (sum != 45) {
                    flag = false;
                    break;
                }
            }

            for (int i = 0; i < 9 && flag; i++) {
                int sum = 0;
                for (int j = 0; j < 9; j++) sum += sdo[j][i];
                if (sum != 45) {
                    flag = false;
                    break;
                }
            }

            for (int x = 0; x <= 6 && flag; x += 3) {
                for (int y = 0; y <= 6 && flag; y += 3) {
                    int sum = 0;
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            sum += sdo[i][j];
                        }
                    }
                    if (sum != 45) {
                        flag = false;
                        break;
                    }
                }
            }

            System.out.println("#" + testCase + " " + (flag ? 1 : 0));
        }
    }
}