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


        HashSet<String> hear = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            hear.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (hear.contains(name)) result.add(name);
        }

        Collections.sort(result);

        sb.append(result.size()).append('\n');
        for (String s : result) sb.append(s).append('\n');

        System.out.println(sb);
    }
}