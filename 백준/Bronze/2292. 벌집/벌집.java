import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int layer = 1, max = 1;

        while (N > max) {
            max += 6 * layer;
            layer++;
        }
        System.out.println(layer);
    }
}
