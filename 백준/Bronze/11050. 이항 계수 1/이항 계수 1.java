import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int nFact = 1;
        int kFact = 1;
        int nkFact = 1;

        for (int i = 2; i <= N; i++) {
            nFact *= i;
        }

        for (int i = 2; i <= K; i++) {
            kFact *= i;
        }

        for (int i = 2; i <= N - K; i++) {
            nkFact *= i;
        }

        System.out.println(nFact / (kFact * nkFact));
    }
}

