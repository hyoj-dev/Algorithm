import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        int answer = 0;
        int limit = nums.length / 2; 
        
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int key : map.keySet()) {
            if(map.get(key) >= 1 && !set.contains(key)) {
                if(limit > answer) {
                    answer++;
                    set.add(key);
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        
        return answer;
    }
}