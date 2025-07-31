import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String[] croatian = {"dz=", "lj", "nj", "c-", "d-", "c=", "s=", "z="};

        for (String s : croatian) {
            word = word.replace(s, "*");
        }
        System.out.println(word.length());

    }
}
