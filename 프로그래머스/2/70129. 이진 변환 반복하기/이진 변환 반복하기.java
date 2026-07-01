import java.util.*;

class Solution {
    public int[] solution(String s) {
        int cnt = 0, one = 0, rmZero = 0;
        
        while(!s.equals("1")) {
            for (char c : s.toCharArray()) {
                if(c == '1') one++;
                else rmZero++;
            }
            
            s = Integer.toBinaryString(one);
            cnt++;
            one = 0;
        }
        
        return new int[] {cnt, rmZero};
    }
}