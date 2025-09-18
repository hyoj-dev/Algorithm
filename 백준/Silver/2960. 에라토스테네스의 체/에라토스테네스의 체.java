import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] ch = new int[N+1];
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (ch[i] == 0) {
                for (int j = i; j <= N; j += i) {
                    ch[j] = 1;
                    if (!arr.contains(j)) {
                        arr.add(j);
                    }
                }
            }
        }
        System.out.println(arr.get(K - 1));
    }
}