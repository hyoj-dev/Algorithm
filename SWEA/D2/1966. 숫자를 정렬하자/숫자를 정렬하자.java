import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int testCase = 1; testCase <= T; testCase++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Integer> nums = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < N; i++) nums.add(Integer.parseInt(st.nextToken()));
            Collections.sort(nums);

            System.out.print("#" + testCase + " ");
            for (Integer num : nums) System.out.print(num + " ");
            System.out.println();
            nums.clear();
        }
    }
}