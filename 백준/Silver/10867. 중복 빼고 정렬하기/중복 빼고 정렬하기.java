import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> nums = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            nums.add(sc.nextInt());
        }
        
        for (Integer num : nums) {
            System.out.print(num+" ");
        }
    }
}