import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int test_case = 1; test_case <= 10; test_case++) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int i = 2; i < arr.length-2; i++) {
                int h = arr[i];
                int tmpHigh1 = Math.max(arr[i - 2], arr[i - 1]);
                int tmpHigh2 = Math.max(arr[i + 2], arr[i + 1]);
                int lowHigh = Math.max(tmpHigh1, tmpHigh2);
                if (h > arr[i - 2] && h > arr[i - 1] && h > arr[i + 1] && h > arr[i + 2]) {
                    sum += h - lowHigh;
                }
            }

            sb.append("#").append(test_case).append(" ").append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
/*
* 10개의 건물이 주어진다. 양옆으로 2칸이 비어있다면 그 칸은 전망 좋은것.
* 전망 좋은 칸들 다 구하기
*
* 2번 부터 시작해서 앞앞이랑 뒤뒤 비교 -> 예외는 아예 for문 범위로 잡기
*
* 만약에 일단 i번째 높이가 (i>앞앞 && i > 앞 && i>뒤 && i>뒤뒤)면 전망 굿.
* -> i번째에서 그 앞 높이들중 가장 큰값을 뺀다
*
*
* */