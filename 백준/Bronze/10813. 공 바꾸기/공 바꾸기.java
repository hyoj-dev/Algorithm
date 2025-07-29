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
        
        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = buckets[i-1];

            buckets[i-1] = buckets[j-1];
            buckets[j-1] = temp;
        }
        for (int bucket : buckets) {
            System.out.print(bucket + " ");
        }
    }
}
