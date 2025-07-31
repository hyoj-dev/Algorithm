import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String reversed = new StringBuffer(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}