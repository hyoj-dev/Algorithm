import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] days = new int[progresses.length];
        
        for (int i = 0; i < progresses.length; i++) {
            days[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i]; 
        }
        
        int day = days[0];
        int cnt = 1;
        
        for(int i = 1; i < days.length; i++) {
            if(days[i] <= day)  cnt++;
            else {
                answer.add(cnt);
                day = days[i];
                cnt = 1;
            }
        }
        
        answer.add(cnt);
        
        return answer.stream()
            .mapToInt(i -> i)
            .toArray();
    }
}