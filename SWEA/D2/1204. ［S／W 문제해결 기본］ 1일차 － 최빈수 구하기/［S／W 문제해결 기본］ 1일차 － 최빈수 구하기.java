import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            int tc = Integer.parseInt(br.readLine());   //출력 테스트 케이스

            HashMap<Integer, Integer> map = new HashMap<>();

            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

            for (int i = 0; i < 1000; i++) {
                int num = Integer.parseInt(st1.nextToken());

                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int maxV = Integer.MIN_VALUE;
            int maxK = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
                int key = integerIntegerEntry.getKey();
                int value = integerIntegerEntry.getValue();


                if (maxV < value) {
                    maxV = value;
                    maxK = key;
                } else if (maxV == value) {
                    maxK = Math.max(maxK, key);
                }
            }
            System.out.println("#" + tc + " " + maxK);
        }
    }
}