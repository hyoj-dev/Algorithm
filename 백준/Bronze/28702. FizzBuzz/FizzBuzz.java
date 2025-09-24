import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[3];
        int pos = 0, num = 0;

        for (int i = 0; i < str.length; i++) {
            str[i] = br.readLine();
            try {
                num = Integer.parseInt(str[i]);
                pos = i;
            } catch (NumberFormatException e) {
            }
        }

        if (pos == 0) {
            num += 3;
        } else if (pos == 1) {
            num += 2;
        } else if (pos == 2) {
            num += 1;
        }

        if (num % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}

