import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, answer;
    static int[] arr = {1, 2, 3};
    public static void DFS(int sum){
        if (sum == N) {
            answer++;
            return;
        }
        if(sum > N) return;

        for (int i = 0; i < 3; i++) {
            DFS(sum+arr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            N = Integer.parseInt(br.readLine());
            answer = 0;
            DFS(0);
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}