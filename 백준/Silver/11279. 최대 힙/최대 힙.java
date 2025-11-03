import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        while (N-- > 0) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (pQ.isEmpty()) sb.append(0).append('\n');
                else sb.append(pQ.poll()).append('\n');
            } else {
                pQ.offer(num);
            }
        }

        System.out.println(sb);
    }
}