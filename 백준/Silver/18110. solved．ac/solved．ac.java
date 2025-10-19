import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] dl = new int[n];
        for (int i = 0; i < n; i++) {
            dl[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(dl);

        double trimmedMean1 = n * 0.15;
        int trimmedMean2 = (int) Math.round(trimmedMean1);

        int sum = 0;
        for (int i = trimmedMean2; i < dl.length - trimmedMean2; i++) {
            sum += dl[i];
        }

        double aver = (double) sum / (dl.length - trimmedMean2 * 2);
        System.out.println(Math.round(aver));
    }
}