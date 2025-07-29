import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] bucket = new int[n];
        
        for (int x = 0; x < m; x++) {
            int i = sc.nextInt();     //start 
            int j = sc.nextInt();     //end 
            int k = sc.nextInt();     //ballNum 

            for (int y = i; y <= j; y++) {
                bucket[y-1] = k;
            }
        }
        for (int l : bucket) {
            System.out.print(l + " ");
        }
    }
}
