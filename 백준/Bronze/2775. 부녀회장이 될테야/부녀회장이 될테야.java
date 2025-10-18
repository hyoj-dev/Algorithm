import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(calcP(k, n));
        }
    }

    public static int calcP(int k, int n) {
        int[] people = new int[n];

        for (int i = 0; i < n; i++) {
            people[i] = i+1;
        }

        for (int floor = 0; floor < k; floor++) {
            for (int i = 1; i < n; i++) {
                people[i] = people[i] + people[i - 1];
            }
        }
        return people[n - 1];
    }
}