import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tbl = new char[5][15];

        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                tbl[i][j] = line.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (tbl[i][j] != '\u0000') {
                    System.out.print(tbl[i][j]);
                }
            }
        }
    }
}