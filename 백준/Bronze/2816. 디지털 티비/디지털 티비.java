import java.io.*;
import java.util.*;

public class Main {
    static String[] channel;
    static int cursor;
    static StringBuilder sb = new StringBuilder();

    private static void move(String target, int goal) {

        while(!channel[cursor].equals(target)) {
            cursor++;
            sb.append("1");
        }

        while (cursor > goal) {
            String tmp = channel[cursor];
            channel[cursor] = channel[cursor - 1];
            channel[cursor - 1] = tmp;

            cursor--;
            sb.append("4");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        channel = new String[N];
        for (int i = 0; i < N; i++) {
            channel[i] = br.readLine();
        }

        move("KBS1", 0);
        move("KBS2", 1);

        System.out.println(sb);
    }
}