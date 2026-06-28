import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String clothType = cloth[1];
            map.put(clothType, map.getOrDefault(clothType, 0) + 1);
        }
        
        int answer = 1;
        
        for (int cnt : map.values()) {
            answer *= (cnt+1);
        }
        
        return answer-1;
    }
}