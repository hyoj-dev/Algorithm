import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        ArrayList<Integer> S = new ArrayList<>();

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String calc = st.nextToken();

            int num = 0;
            if (!calc.equals("all") && !calc.equals("empty")) num = Integer.parseInt(st.nextToken());

            switch (calc) {
                case "add":
                    S.add(num);
                    break;

                case "remove":
                    if (isIn(S,num)) S.remove((Integer) num);
                    else continue;
                    break;

                case "check":
                    sb.append(isIn(S, num) ? 1 : 0).append('\n');
                    break;

                case "toggle":
                    if (isIn(S,num)) S.remove((Integer) num);
                    else S.add(num);
                    break;

                case "all":
                    S.clear();
                    for (int i = 1; i <= 20; i++) S.add(i);
                    break;

                case "empty":
                    S.clear();
                    break;
            }
        }
        System.out.println(sb);
    }

    public static boolean isIn(ArrayList<Integer> S, int num) {
        return S.contains(num);
    }
}