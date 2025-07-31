import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] buckets = new int[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = i+1;
        }

        for (int l = 0; l < m; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int left = i - 1;
            int right = j - 1;

            while (left < right) {
                int tmp = buckets[left];
                buckets[left] = buckets[right];
                buckets[right] = tmp;
                left++;
                right--;
            }
        }

        for (int bucket : buckets) {
            System.out.print(bucket + " ");
        }
    }
}
