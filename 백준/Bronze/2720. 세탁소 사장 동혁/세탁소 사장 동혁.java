import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;

            int tmp = N / quarter;
            int remain = N % quarter;
            cnt += tmp;
            System.out.print(cnt + " ");
            cnt = 0;

            tmp = remain / dime;
            remain %= dime;
            cnt += tmp;
            System.out.print(cnt + " ");
            cnt = 0;

            tmp = remain / nickel;
            remain %= nickel;
            cnt += tmp;
            System.out.print(cnt + " ");
            cnt = 0;

            tmp = remain / penny;
            remain %= penny;
            cnt += tmp;
            System.out.print(cnt + " ");
            cnt = 0;
        }

    }
}