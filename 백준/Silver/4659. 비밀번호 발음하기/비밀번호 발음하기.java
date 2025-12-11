import java.io.*;
import java.util.*;

public class Main {
    public static ArrayList<Character> gatherList;
    public static ArrayList<Character> consonantList;

    public static boolean rule1(String pw) {
        for (int i = 0; i < pw.length(); i++) {
            if (gatherList.contains(pw.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean rule2(String pw) {
        for (int i = 2; i < pw.length(); i++) {
            char first = pw.charAt(i - 2), second = pw.charAt(i - 1), third = pw.charAt(i);

            if(gatherList.contains(first) && gatherList.contains(second) && gatherList.contains(third)){
                return false;
            } else if (consonantList.contains(first) && consonantList.contains(second) && consonantList.contains(third)) {
                return false;
            }
        }
        return true;
    }

    public static boolean rule3(String pw) {
        int cnt = 0;
        boolean flag = true;
        for (int i = 1; i < pw.length(); i++) {
            char first = pw.charAt(i - 1), second = pw.charAt(i);

            if (first == second) {
                if (!(first == 'e' && second == 'e') && !(first == 'o' && second == 'o')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        gatherList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        consonantList = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            if(!gatherList.contains(c)) consonantList.add(c);
        }

        while (true) {
            String pw = br.readLine();
            if (pw.equals("end")) break;

            if (rule1(pw) && rule2(pw) && rule3(pw)) {
                sb.append('<').append(pw).append("> is acceptable.");
            } else {
                sb.append('<').append(pw).append("> is not acceptable.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}