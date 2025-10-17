import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st1.nextToken());
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st2.nextToken());
            if (binarySearch(arr, target)) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }

        System.out.println(sb);
    }

    static boolean binarySearch(int[] arr, int n) {
        int lt = 0, rt = arr.length - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if(arr[mid] == n) return true;
            else if (arr[mid] < n) lt = mid + 1;
            else rt = mid - 1;
        }
        return false;
    }
}