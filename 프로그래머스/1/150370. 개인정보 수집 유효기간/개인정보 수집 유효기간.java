import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            String[] tmp = term.split(" ");
            termMap.put(tmp[0], Integer.parseInt(tmp[1]));
        }

        int todayDays = calcDate(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] tmp = privacies[i].split(" ");

            String privacyDate = tmp[0];
            String privacyTerm = tmp[1];

            int termNum = termMap.get(privacyTerm);

            int expireDate = calcDate(privacyDate) + termNum * 28;

            if (todayDays >= expireDate) {
                answer.add(i + 1);
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int calcDate(String date) {
        String[] arr = date.split("\\.");

        int year = Integer.parseInt(arr[0]);
        int mon = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        return year * 12 * 28 + mon * 28 + day;
    }
}