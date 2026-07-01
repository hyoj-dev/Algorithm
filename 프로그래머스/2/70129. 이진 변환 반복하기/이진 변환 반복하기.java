import java.util.*;

class Solution {
    public int[] solution(String s) {
        int cnt = 0, one = 0, rmZero = 0;
        
        String binaryString = s;
        
        while(!binaryString.equals("1")) {
            for (char c : binaryString.toCharArray()) {
                if(c == '1') one++;
                else rmZero++;
            }
            
            binaryString = Integer.toBinaryString(one);
            cnt++;
            one = 0;
        }
        
        return new int[] {cnt, rmZero};
    }
}