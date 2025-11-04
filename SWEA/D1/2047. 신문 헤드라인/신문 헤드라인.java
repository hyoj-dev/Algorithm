import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String headLine = br.readLine();
        for (char c : headLine.toCharArray()) {
            if (c != '_') sb.append(Character.toUpperCase(c));
            else sb.append(c);
        }
        System.out.println(sb);
    }
}