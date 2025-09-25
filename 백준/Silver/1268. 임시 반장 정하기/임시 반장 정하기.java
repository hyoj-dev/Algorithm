import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] grades = new int[N+1][6];

        int answer = 0, max = Integer.MIN_VALUE;
        
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <= 5; j++) {
                grades[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (grades[i][k] == grades[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}

