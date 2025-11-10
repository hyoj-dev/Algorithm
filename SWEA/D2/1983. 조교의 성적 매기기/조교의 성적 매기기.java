import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st1.nextToken());
            int K = Integer.parseInt(st1.nextToken());

            double[] total = new double[N];
            ArrayList<Double> scores = new ArrayList<>();

            for (int stuNum = 0; stuNum < N; stuNum++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int mid = Integer.parseInt(st2.nextToken());
                int fin = Integer.parseInt(st2.nextToken());
                int sub = Integer.parseInt(st2.nextToken());

                total[stuNum] = mid * 0.35 + fin * 0.45 + sub * 0.2;
                scores.add(total[stuNum]);
            }
            Collections.sort(scores, Collections.reverseOrder());

            double target = total[K - 1];
            int rank = scores.indexOf(target);
            int gradeIdx = rank / (N / 10);
            String[] grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

            System.out.println("#" + testCase + " " + grade[gradeIdx]);
        }
    }
}