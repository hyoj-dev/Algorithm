import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        
        for (int testCase = 1; testCase <= T; testCase++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[10];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);
            int[] arr2 = new int[8];
            for (int i = 1; i < 9; i++) {
                arr2[i-1] = arr[i];
            }

            int sum = 0;
            for (int i : arr2) {
                sum += i;
            }
            
            System.out.println("#" + testCase+" "+Math.round((float) sum /8));
        }
    }
}