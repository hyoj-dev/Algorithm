import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder year = new StringBuilder();
        StringBuilder month = new StringBuilder();
        StringBuilder day = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            String str = br.readLine();
            char[] arr = str.toCharArray();

            String answer = "";

            year = year.append(arr[0]).append(arr[1]).append(arr[2]).append(arr[3]);
            answer = year.toString();

            month = month.append(arr[4]).append(arr[5]);
            day = day.append(arr[6]).append(arr[7]);

            int monInt = Integer.parseInt(month.toString());
            int dayInt = Integer.parseInt(day.toString());

            if (monInt > 0 && monInt <= 12) {
                answer = answer + "/" + month;
            } else {
                answer = Integer.toString(-1);
            }

            switch (monInt) {
                case 1:
	            case 3:
                case 5:
				case 7:
				case 8:
				case 10:
				case 12:
                    if (dayInt>0 && dayInt<=31) answer = answer + "/" + day;
                    else answer = Integer.toString(-1);
                    break;

                case 4:
                case 6:
				case 9:
                case 11:
                    if (dayInt>0 && dayInt<=30) answer = answer + "/" + day;
                    else answer = Integer.toString(-1);
                    break;

                case 2:
                    if (dayInt>0 && dayInt<=28) answer = answer + "/" + day;
                    else answer = Integer.toString(-1);
                    break;
            }

            System.out.println("#" + i + " " + answer);

            year.setLength(0);
            month.setLength(0);
            day.setLength(0);
        }
    }
}