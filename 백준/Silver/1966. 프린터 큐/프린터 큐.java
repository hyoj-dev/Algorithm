import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            Queue<Integer> imp = new LinkedList<>();
            Integer[] sortedImp = new Integer[N];


            for (int j = 0; j < N; j++) {
                int val = Integer.parseInt(st2.nextToken());
                imp.offer(val);
                sortedImp[j] = val;
            }

            Arrays.sort(sortedImp, Collections.reverseOrder());
            int cnt = 0;
            int idx = 0;

            while (!imp.isEmpty()) {
                int current = imp.poll();

                if (current == sortedImp[idx]) {
                    cnt++;
                    idx++;
                    if (M == 0) {
                        System.out.println(cnt);
                        break;
                    }
                } else imp.offer(current);

                if (M==0) M = imp.size() - 1;
                else M--;
            }
        }
    }
}