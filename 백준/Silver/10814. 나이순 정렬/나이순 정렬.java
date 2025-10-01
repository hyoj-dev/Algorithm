import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, List<String>> list = new HashMap<>();
        int[] ages = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            ages[i] = age;

            list.putIfAbsent(age, new ArrayList<>());
            list.get(age).add(st.nextToken());
        }

        Arrays.sort(ages);

        int prev = -1;
        for (int i = 0; i < N; i++) {
            int age = ages[i];
            if (age == prev) continue;
            prev = age;

            List<String> names =list.get(age);
            for (String name : names) {
                System.out.println(age + " " + name);
            }
        }

    }
}