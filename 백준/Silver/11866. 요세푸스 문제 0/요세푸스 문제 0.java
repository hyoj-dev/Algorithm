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
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> answer = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            q.offer(i + 1);
        }

        int cnt = 1;
        while (!q.isEmpty()) {
            if (cnt != K) {
                q.offer(q.poll());
                cnt++;
            } else {
                answer.add(q.poll());
                cnt = 1;
            }
        }

        sb.append("<");
        for (Integer i : answer) {
            sb.append(i).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}