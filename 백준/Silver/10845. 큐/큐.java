import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String cmd = st.nextToken();

            switch (cmd) {
                case "push":
                    q.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    if (q.isEmpty()) System.out.println(-1);
                    else System.out.println(q.peek());
                    break;
                case "back":
                    int lastIdx = q.size()-1;
                    Object[] arr = q.toArray();
                    if (q.isEmpty()) System.out.println(-1);
                    else System.out.println(arr[lastIdx]);
                    break;
                case "size":
                    System.out.println(q.size());
                    break;
                case "empty":
                    if (q.isEmpty()) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "pop":
                    if (q.isEmpty()) System.out.println(-1);
                    else System.out.println(q.poll());
                    break;
            }
        }
    }
}