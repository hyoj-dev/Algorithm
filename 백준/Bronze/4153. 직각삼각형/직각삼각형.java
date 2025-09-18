import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            ArrayList<Integer> arr = new ArrayList<>();

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 & b == 0 & c == 0) {
                break;
            }

            arr.add(a);
            arr.add(b);
            arr.add(c);

            Collections.sort(arr);

            double a2b2 = Math.pow(arr.get(0),2) + Math.pow(arr.get(1),2);
            double c2 = Math.pow(arr.get(2), 2);

            if (a2b2 == c2) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}

