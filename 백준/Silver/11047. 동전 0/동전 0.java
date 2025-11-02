import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> money = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            money.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(money, Comparator.reverseOrder());

        for (int i = 0; i < money.size(); i++) {
            if (money.get(i) <= K) {
                cnt += K / money.get(i);
                K %= money.get(i);
            }
        }

        System.out.println(cnt);
    }
}