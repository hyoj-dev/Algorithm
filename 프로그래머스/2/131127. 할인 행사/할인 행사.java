import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        HashMap<String, Integer> windowMap = new HashMap<>();
        HashMap<String, Integer> wantMap = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) wantMap.put(want[i], number[i]);
        
        for(int i = 0; i < 10; i++) {
            windowMap.put(
                discount[i], windowMap.getOrDefault(discount[i], 0) + 1);
        }
        
        if(wantMap.equals(windowMap)) answer++;
        
        int left = 0, right = 9;
        
        for(int i = 0; i < discount.length - 10; i++) {
            
            String out = discount[left++];
            windowMap.put(out, windowMap.get(out) - 1);
            
            if(windowMap.get(out) == 0) {
                windowMap.remove(out);
            }
            
            String in = discount[++right];
            windowMap.put(in, windowMap.getOrDefault(in, 0) + 1);
            
            if(wantMap.equals(windowMap)) answer++;
        }
        
        return answer;
    }   
}