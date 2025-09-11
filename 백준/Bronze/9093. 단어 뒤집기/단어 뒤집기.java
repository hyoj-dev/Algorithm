import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        String[] arr = new String[100];

        for (int i = 0; i < T; i++) {
            arr = br.readLine().split(" ");

            for (int j = 0; j < arr.length; j++) {
                String reversed = new StringBuffer(arr[j]).reverse().toString();
                System.out.print(reversed + " ");
            }
            System.out.println();
        }
    }
}