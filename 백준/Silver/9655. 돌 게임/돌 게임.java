import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int turn = 0;
        while (N > 0) {
            if (N >= 3) {
                N -= 3;
                turn++;
            } else {
                N -= 1;
                turn++;
            }
        }

        if (turn % 2 == 0) System.out.println("CY");
        else System.out.println("SK");
    }
}