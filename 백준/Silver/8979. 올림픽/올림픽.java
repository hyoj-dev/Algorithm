import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Nation {
    int id, gold, silver, bronze, rank;

    public Nation(int id, int gold, int silver, int bronze) {
        this.id = id;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st1.nextToken());
        int K = Integer.parseInt(st1.nextToken());

        ArrayList<Nation> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int nation = Integer.parseInt(st2.nextToken());
            int gold = Integer.parseInt(st2.nextToken());
            int silver = Integer.parseInt(st2.nextToken());
            int bronze = Integer.parseInt(st2.nextToken());

            Nation n = new Nation(nation, gold, silver, bronze);

            list.add(n);
        }

        list.sort((a, b) -> {
            if (a.gold != b.gold) return b.gold - a.gold;
            if (a.silver != b.silver) return b.silver - a.silver;
            return b.bronze - a.bronze;
        });

        calcRank(list);

        for (Nation nation : list) {
            if (nation.id == K) {
                System.out.println(nation.rank);
                break;
            }
        }

    }

    static void calcRank(List<Nation> list) {
        list.get(0).rank = 1;

        for (int i = 1; i < list.size(); i++) {
            Nation cur = list.get(i);
            Nation prev = list.get(i - 1);

            if (cur.gold == prev.gold && cur.silver == prev.silver && cur.bronze == prev.bronze) cur.rank = prev.rank;
            else cur.rank = i + 1;
        }
    }
}