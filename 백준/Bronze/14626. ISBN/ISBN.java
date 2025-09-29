import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = br.readLine();
        ArrayList<Character> c = new ArrayList<>();
        int starIdx = 0;

        for (int i = 0; i < isbn.length(); i++) {
            c.add(isbn.charAt(i));

            if (isbn.charAt(i) == '*') {
                starIdx = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < c.size(); i++) {
            char ch = c.get(i);
            if (ch == '*') continue;

            int num = ch - '0';
            if(i%2 == 0) sum += num;
            else sum += num * 3;
        }

        if (starIdx == 12) {
            int checkDigit = (10 - (sum % 10)) % 10;
            System.out.println(checkDigit);
        } else {
            for (int x = 0; x <= 9; x++) {
                int candidateSum = sum;
                if (starIdx % 2 == 0) candidateSum += x;
                else candidateSum += x * 3;

                if (candidateSum % 10 == 0) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}