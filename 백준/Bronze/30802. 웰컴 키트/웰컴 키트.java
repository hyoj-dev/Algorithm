import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] sup = new int[6];

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < sup.length; i++) {
            sup[i] = Integer.parseInt(st1.nextToken());
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        int ts = Integer.parseInt(st2.nextToken());
        int pen = Integer.parseInt(st2.nextToken());

        int tOrder = 0;

        for (int i = 0; i < sup.length; i++) {
            tOrder += (sup[i] + ts - 1) / ts;
        }

        int penPer = N / pen;
        int penRemain = N % pen;

        System.out.println(tOrder);
        System.out.println(penPer + " " + penRemain);
    }
}