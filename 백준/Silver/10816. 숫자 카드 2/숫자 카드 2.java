import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> cardsHave = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st1.nextToken());
            cardsHave.put(num, cardsHave.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st2.nextToken());
            sb.append(cardsHave.getOrDefault(num, 0)).append(' ');
        }

        System.out.println(sb);
    }
}