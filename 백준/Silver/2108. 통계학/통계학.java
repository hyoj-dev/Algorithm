import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }
        Arrays.sort(nums);

        long aver = Math.round((double) sum / N);
        System.out.println(Math.round(aver));

        System.out.println(nums[N / 2]);

        System.out.println(count(nums));

        System.out.println(nums[N - 1] - nums[0]);
    }

    public static int count(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCnt = Collections.max(map.values());

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == maxCnt) list.add(key);
        }
        Collections.sort(list);

        if (list.size() > 1) return list.get(1);
        else return list.get(0);
    }
}