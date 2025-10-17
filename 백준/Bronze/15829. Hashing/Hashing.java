import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char key = (char) ('a' + i);
            int value = 'a' + i - 96;

            map.put(key, value);
        }

        int sum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < N; i++) {
            char key = arr[i];
            sum += (int) (map.get(key) * Math.pow(31, i));
        }

        System.out.println(sum);
    }
}
