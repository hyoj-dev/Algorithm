import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int gcdNum, lcmNum;

        gcdNum = gcd(num1, num2);
        lcmNum = lcm(num1, num2);

        System.out.println(gcdNum);
        System.out.println(lcmNum);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a * b) / gcd;
    }
}