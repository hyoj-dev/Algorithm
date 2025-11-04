import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int sum = 0;
        for (char c : num.toCharArray()) {
            sum += c - '0';
        }
        System.out.println(sum);
    }
}