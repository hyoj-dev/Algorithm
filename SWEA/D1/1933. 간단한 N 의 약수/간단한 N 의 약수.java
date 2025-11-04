import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= N/2; i++) {
            if (N % i == 0) {
                answer.add(i);
            }
        }
        answer.add(N);
        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }
}