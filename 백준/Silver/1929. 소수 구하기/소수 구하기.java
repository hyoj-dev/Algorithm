import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int[] nums = new int[num2 - num1 + 1];

        ArrayList<Integer> answers = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = num1 + i;
            if (isPrime(nums[i])) answers.add(nums[i]);
        }

        for (Integer answer : answers) {
            System.out.println(answer);
        }

    }

    static boolean isPrime(int a) {
        if(a<2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i == 0) return false;
        }
        return true;
    }
}