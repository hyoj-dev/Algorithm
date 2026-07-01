import java.util.*;

class Solution {
    public int[] solution(String s) {
        int cnt = 0, rmZero = 0;
        
        HashMap<Character, Integer> binaryMap = new HashMap<>();
        
        String binaryString = s;
        
        while(!binaryString.equals("1")) {
            for (char c : binaryString.toCharArray()) {
                binaryMap.put(c, binaryMap.getOrDefault(c, 0) + 1);
            }
        
            cnt++; 
            rmZero += binaryMap.getOrDefault('0', 0);
        
            binaryString = Integer.toBinaryString(binaryMap.get('1'));
            binaryMap.clear();
            
        }
        
        int[] answer = {cnt, rmZero};
        
        return answer;
    }
}