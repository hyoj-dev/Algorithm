import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            int cnt = i;
            for (int j = 0; j < 5; j++) {
                if (j == cnt) sb.append('#');
                else sb.append('+');
            }
            System.out.println(sb);
            sb.setLength(0);
        }
    }
}