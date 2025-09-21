import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] scores = new int[N];
        int score = 0;
        int total = 0;

        for (int i = 0; i < N; i++) {

            int right = Integer.parseInt(st.nextToken());
            if (right != 0) {
                score += 1;
            } else {
                score = 0;
            }
            scores[i] = score;
        }
        for (int s : scores) {
            total += s;
        }
        System.out.println(total);
    }
}
