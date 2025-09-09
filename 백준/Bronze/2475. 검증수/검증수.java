import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[5];
        int sum = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
            int tmp = (int) Math.pow(intArr[i], 2);
            sum = sum + tmp;
        }
        System.out.println(sum%10);
    }
}