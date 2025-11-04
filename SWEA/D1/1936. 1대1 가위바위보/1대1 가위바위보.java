import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int result = A - B;

        char answer;
        if (result == 1) answer = 'A';
        else if (Math.abs(result) == 2 && A < B) answer = 'A';
        else answer = 'B';
        System.out.println(answer);
    }
}