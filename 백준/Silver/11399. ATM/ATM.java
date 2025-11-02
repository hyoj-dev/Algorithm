import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] time = new int[N];
        for (int i = 0; i < N; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(time);

        int tmp = 0;
        int[] withdraw = new int[N];
        for (int i = 0; i < N; i++) {
            tmp += time[i];
            withdraw[i] = tmp;
        }

        int answer = 0;
        for (int i : withdraw) {
            answer += i;
        }

        System.out.println(answer);
    }
}