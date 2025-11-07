import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());


        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        ArrayList<Integer> changes = new ArrayList<>();

        for (int testCase = 1; testCase <= T; testCase++) {
            int money = Integer.parseInt(br.readLine());

            for (int i = 0; i < arr.length; i++) {
                if (money / arr[i] != 0) {
                    changes.add(money / arr[i]);
                    money = money % arr[i];
                } else {
                    changes.add(0);
                }
            }

            System.out.println("#" + testCase);
            for (Integer change : changes) {
                System.out.print(change + " ");
            }
            System.out.println();
            changes.clear();
        }
    }
}