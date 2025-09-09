import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numCnt = new int[10];

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int m = A * B * C;
        String str = Integer.toString(m);

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < numCnt.length; j++) {
                char tmp = str.charAt(i);
                if (Integer.parseInt(String.valueOf(tmp)) == j) {
                    numCnt[j]++;
                }
            }
        }
        for (int i : numCnt) {
            System.out.println(i);
        }
    }
}