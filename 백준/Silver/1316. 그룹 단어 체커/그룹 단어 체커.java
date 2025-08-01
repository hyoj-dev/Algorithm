import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length; i++) {
            boolean[] visited = new boolean[26];
            char prev = 0;
            boolean isGroup = true;

            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);

                if (c != prev) {
                    if (visited[c - 'a']) {
                        isGroup = false;
                        break;
                    }
                    visited[c - 'a'] = true;
                }
                prev = c;
            }
            if (isGroup) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
