import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int P = Integer.parseInt(br.readLine());

        for (int t = 0; t < P; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int T = Integer.parseInt(st.nextToken());
            int[] arr = new int[20];

            int cnt = 0;

            for (int i = 0; i < 20; i++) {
                arr[i] = Integer.parseInt(st.nextToken());

                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[i]) {
                        cnt += (i - j);
                        break;
                    }
                }
                Arrays.sort(arr, 0, i + 1);
            }
            System.out.println(T + " " + cnt);
        }
    }
}