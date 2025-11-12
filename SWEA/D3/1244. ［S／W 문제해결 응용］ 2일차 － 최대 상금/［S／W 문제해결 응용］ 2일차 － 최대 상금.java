import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    static ArrayList<String> check = new ArrayList<>();
    static int answer = Integer.MIN_VALUE;

    static void DFS(int L, char[] nArr, int change) {
        if (L == change) {
            int value = Integer.parseInt(new String(nArr));
            answer = Integer.max(value, answer);
            return;
        } else {
            String state = new String(nArr) + "," + L;
            if (check.contains(state)) return;
            check.add(state);

            for (int i = 0; i < nArr.length-1; i++) {
                for (int j = i + 1; j < nArr.length; j++) {
                    swap(nArr, i, j);
                    DFS(L+1, nArr, change);
                    swap(nArr, i, j);
                }
            }
        }
    }

    static void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            check.clear();
            answer = Integer.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String num = st.nextToken();
            int change = Integer.parseInt(st.nextToken());

            char[] nArr = num.toCharArray();

            DFS(0, nArr, change);

            sb.append("#").append(testCase).append(" ").append(answer).append("\n");
        }
        System.out.print(sb);
    }
}