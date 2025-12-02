import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
    static ArrayList<int[]> bombLocation;
    static int R, C, N;

    public static void findBomb() {
        bombLocation.clear();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if(board[i][j] == 'O') bombLocation.add(new int[]{i, j});
            }
        }
    }

    public static void boom() {
        for (int i = 0; i < bombLocation.size(); i++) {
            int[] now = bombLocation.get(i);
            int x = now[0], y = now[1];

            board[x][y] = '.';         //현재 위치 폭탄 터짐 -> '.'으로 변경

            for (int j = 0; j < 4; j++) {
                int nx = x + dx[j], ny = y + dy[j];

                if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                    board[nx][ny] = '.';
                }
            }

        }
    }

    public static void changeBomb() {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                board[i][j] = 'O';
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        board = new char[R][C];
        bombLocation = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        N--;        //1초 대기 (2번 행동)
        findBomb(); //초기 폭탄 위치 확인

        while (N > 0) {         //3,4번 행동 반복
            changeBomb();       //모든 빈 자리에 폭탄 설치 (3번 행동)
            N--;
            if (N == 0) break;

            boom();             //3초전에 설치된 폭탄 폭파 (4번 행동)
            N--;
            if (N == 0) break;

            findBomb();         //터진 후 남은 폭탄 위치 저장
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                sb.append(board[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}