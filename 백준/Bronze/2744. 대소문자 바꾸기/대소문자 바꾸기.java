import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] cArr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            cArr[i] = str.charAt(i);
            if (Character.isUpperCase(cArr[i])) {
                cArr[i] = Character.toLowerCase(cArr[i]);
            } else {
                cArr[i] = Character.toUpperCase(cArr[i]);
            }
        }
        for (char c : cArr) {
            System.out.print(c);
        }
    }
}