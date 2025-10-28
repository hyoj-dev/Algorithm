import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if (a == 0 && b == 0 && c == 0) break;
            
            String answer;

            if (a == b && b == c) answer = "Equilateral";
            else if (isIt(arr) && a == b || b == c || a == c) answer = "Isosceles";
            else if (!isIt(arr)) answer = "Invalid";
            else answer = "Scalene";

            System.out.println(answer);
        }
    }

    public static boolean isIt(int[] arr) {
        Arrays.sort(arr);
        boolean answer = true;

        int ab = arr[0] + arr[1];

        if (ab <= arr[2]) {
            answer = false;
        }
        return answer;
    }
}