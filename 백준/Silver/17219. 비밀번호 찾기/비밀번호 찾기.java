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
        HashMap<String, String> map = new HashMap<>();

        while (N-- > 0) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            map.put(st2.nextToken(), st2.nextToken());
        }

        for (int i = 0; i < M; i++) {
            String find = br.readLine();
            sb.append(map.get(find)).append('\n');
        }

        System.out.print(sb);
    }
}