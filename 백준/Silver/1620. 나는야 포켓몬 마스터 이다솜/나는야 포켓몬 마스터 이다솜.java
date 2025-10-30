import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> pokedex1 = new HashMap<>();
        HashMap<String, Integer> pokedex2 = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String pokemon = br.readLine();
            pokedex1.put(i, pokemon);
            pokedex2.put(pokemon, i);
        }

        for (int i = 0; i < M; i++) {
            String quest = br.readLine();
            if (Character.isDigit(quest.charAt(0))) {
                int num = Integer.parseInt(quest);
                sb.append(pokedex1.get(num)).append('\n');
            } else {
                sb.append(pokedex2.get(quest)).append('\n');
            }
        }
        System.out.println(sb);
    }
}