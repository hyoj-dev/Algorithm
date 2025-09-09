import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String ox = sc.next();
            int score = 0;
            int sequence = 0;
            
            for (int j = 0; j < ox.length(); j++) {
                if (ox.charAt(j) == 'O') {
                    sequence++;
                    score += sequence;
                } else {
                    sequence = 0;
                }
            }
            System.out.println(score);
        }
    }
}