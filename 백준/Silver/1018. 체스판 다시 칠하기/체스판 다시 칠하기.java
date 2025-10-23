import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] board = new char[N][M];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = 64;

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                int repaintW = 0;
                int repaintB = 0;

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        char current = board[x][y];
                        if ((x + y) % 2 == 0) {
                            if (current != 'W') repaintW++;
                            if (current != 'B') repaintB++;
                        } else {
                            if (current != 'B') repaintW++;
                            if (current != 'W') repaintB++;
                        }
                    }
                }
                min = Math.min(min, Math.min(repaintW, repaintB));
            }
        }
        System.out.println(min);
    }
}