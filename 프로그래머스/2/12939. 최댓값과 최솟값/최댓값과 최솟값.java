import java.util.*;

class Solution {
    public String solution(String s) {
        
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        List<Integer> intList = parseToIntArr(s);
        
        for (Integer num : intList) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        
        String answer = min + " " + max;
        
        return answer;
    }
    
    private List<Integer> parseToIntArr(String s) {
        String[] temp = s.split(" ");
        List<Integer> outPut = new ArrayList<Integer>();
    
        for (String t : temp) outPut.add(Integer.parseInt(t));
        
        return outPut;
    }
}